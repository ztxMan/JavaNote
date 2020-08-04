package com.ztxbibibi.learn.kotlin.classandobject
//public final class Person 默认情况下是这样隐式调用的 如果需要被继承 需要添加open
open class Person(id:Int) {//主构造


    val p :Int = id

    constructor(id: Int,name:String) :this(id){//次构造 TODO按理说不是应该必须实现主构造要不然就报错么

    }

    constructor(id: Int,sex:Char) : this(id){}








}