package com.ztxbibibi.learn.kotlin



fun main() {

    var name = "ztx"
    var age = 27
    var sex  = "M"
    var info = ""

    println("name:$name,age:$age,sex:$sex,info:$info")

    //换行

    var infoMessage = """
        AAAAAAAAA
        BBBBBBBBB
        """".trimIndent()//
    println(infoMessage)

}