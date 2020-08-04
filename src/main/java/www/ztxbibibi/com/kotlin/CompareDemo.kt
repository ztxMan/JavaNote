package com.ztxbibibi.learn.kotlin

//比较两遏制
fun main() {

    //比较值本身
    var name1 = "张三"
    var name2 = "张三"

    println(name1.equals(name2))
    println(name1 == name2)
    //比较对象地址 ===


    var value = 999
    var value2 = 999

    println(value === value2)


}