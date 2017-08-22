/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ml.dmlc.mxnet.spark

import org.scalatest.{BeforeAndAfterEach, FunSuite}

import org.apache.spark.SparkContext

trait PerTest extends BeforeAndAfterEach { self: FunSuite =>
  protected val numWorkers: Int = Runtime.getRuntime.availableProcessors()

  @transient private var _sc: SparkContext = _

  implicit def sc: SparkContext = getOrCreateSparkContext

  override def beforeEach(): Unit = getOrCreateSparkContext

  override def afterEach() {
    synchronized {
      if (_sc != null) {
        _sc.stop()
        _sc
      }
    }
  }

  private def getOrCreateSparkContext = synchronized {
    if (sc == null) {
      _sc = new SparkContext()
      _sc.setLogLevel("ERROR")
    }
    _sc
  }
}
