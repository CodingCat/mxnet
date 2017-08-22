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

import ml.dmlc.mxnet.{Context, Shape, Symbol}
import org.scalatest.FunSuite

class MxNetGeneralTests extends FunSuite with PerTest {

  /*
  private def getMlp: Symbol = {
    val data = Symbol.Variable("data")
    val fc1 = Symbol.FullyConnected(name = "fc1")()(Map("data" -> data, "num_hidden" -> 128))
    val act1 = Symbol.Activation(name = "relu1")()(Map("data" -> fc1, "act_type" -> "relu"))
    val fc2 = Symbol.FullyConnected(name = "fc2")()(Map("data" -> act1, "num_hidden" -> 64))
    val act2 = Symbol.Activation(name = "relu2")()(Map("data" -> fc2, "act_type" -> "relu"))
    val fc3 = Symbol.FullyConnected(name = "fc3")()(Map("data" -> act2, "num_hidden" -> 10))
    val mlp = Symbol.SoftmaxOutput(name = "softmax")()(Map("data" -> fc3))
    mlp
  }

  test("build RDD containing boosters with the specified worker number") {
    val trainingRDD = sc.parallelize(MNIST.train)
    val mxNetRDD = new MXNet()
      .setBatchSize(128)
      .setLabelName("softmax_label")
      .setContext(Array(Context.cpu()))
      .setDimension(Shape(784))
      .setNetwork(getMlp)
      .setNumEpoch(10)
      .setNumServer(1)
      .setNumWorker(2)
      .setExecutorJars(cmdLine.jars)
      .setJava(cmdLine.java)
    val boosterCount = mxNetRDD.count()
    assert(boosterCount === 2)
  }
  */
}
