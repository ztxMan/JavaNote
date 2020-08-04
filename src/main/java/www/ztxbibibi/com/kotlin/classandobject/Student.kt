package com.ztxbibibi.learn.kotlin.classandobject

class Student(id:Int):Person(id) {
    //在 kotlin全部都是没有默认值
    //在java成员是有默认值得，但是方法内部没有默认值

    var name :String = "God"
    var age :Int = 0

    //懒加载 如果没有赋值就不能使用否则报错
    lateinit var studentId :String



}