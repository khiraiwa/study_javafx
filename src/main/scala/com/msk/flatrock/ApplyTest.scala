package com.msk.flatrock

class ApplyTest {

}

object Pair {
  def apply[A, B](x:A, y:B) = (x, y)
  def unapply[A, B](x: (A, B)): Option[(A, B)] = Some(x)
}