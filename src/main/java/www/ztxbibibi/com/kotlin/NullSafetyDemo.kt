package com.ztxbibibi.learn.kotlin

/**
 * kotlin 对null的处理
 */
fun main() {
    var info: String? = null
//    println(info?.length)//第一种方案 ：？如果 info为空 就不继续执行 length
//
//    println(info!!.length)//为自己负责  == java
//
//    if (info != null) {//==java 判断null
//
//
//    }


//    println()
    println(testMethod("ztx ")    ?:"您很牛逼")
}


//方法允许返回null


fun testMethod(name:String):Int?{
    if (name == "ztx") {
        return 1
    }
    return null
}