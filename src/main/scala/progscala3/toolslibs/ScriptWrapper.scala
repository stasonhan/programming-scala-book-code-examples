// src/main/scala/progscala3/toolslibs/ScriptWrapper.scala

object ScriptWrapper:
  def main(args: Array[String]): Unit =
    val result = new AnyRef:
      // Your script code is inserted here.
      print("End of script")
    println(s"result: $result")
