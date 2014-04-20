package com.msk.flatrock

object Option {
  // typedefと同じ
  type In = Int
  
  // []はjavaでいうGenerics
  // [+A]はAのサブ，[-A]はAのスーパー，[_]はJavaの?と同じ意味のはず
  // AnyはObjectのこと
  def testOption: Option[(Int, Int)] = {
    var i: Int = 0
    if ( i == 0) Some( 1, 1 )
    else None
  }
}