package com.ztxbibibi.learn.kotlin.classandobject



fun main() {
   var p = Person(777,"s")

   println(p.p)
   //bean.copy()的使用
   var res = BaseResponse(999,"1")
   val(mCode,message)= res.copy()
   //_为关闭copy
   val(_mCode,message2)= res.copy()

   //object 标签的使用
   MyEngine.method();


  var s = Student(1)

}