package com.msk.flatrock

class Tuple {
  def execute(x1:Any, x2:Any): (Any, Any) = {
    (1, 1)
  }
}

object Tuple {
  def main(args:Array[String]):Unit = {
    def tupleator (x1:Any, x2:Any) = (x1, x2);
    def tupleator2 = (x1:Any, x2:Any, x3:Any) => {
      (x1, x2)
    }
    val t = tupleator2("hello", 1, 1)
    println(t._1)
    println(t._2)
    val (t1, t2) = tupleator2("hello2", 111, 111)
    println(t1)
    println(t2)
    val tt = new Tuple
    val (t3, t4) = tt.execute(10, 10)
    println(t3)
    println(t4)
    
    val ttt = 10 -> 20 ->33
    println(ttt._1)
    println(ttt._2)
    
  }
}