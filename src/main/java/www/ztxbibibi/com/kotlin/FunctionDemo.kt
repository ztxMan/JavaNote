package com.ztxbibibi.learn.kotlin

//TODO 函数（可以写在类的外面 ）
//void == :Unit
fun main() {
    println(add(1,1))

    lenMethod(1,2,3,4,5)
    //lambda
 var addMethod: (Int,Int)->Int = {
        number1,number2->number1+number2
    }

}

fun add(p1:Int,p2:Int):Int{
    return p1+p2
}

//可变长参数
fun lenMethod(vararg number: Number){
    for (i in number){
        println(i)
    }
}

//边界
fun borderMethod(){
    for (i in 1..9){

    }

    for (i in 9 downTo 1){


    }


    var value = 88
    if (value in 1..100){
        for (i in 1..20 step 2){


        }
    }

}