package com.example.hw_w1_pr3

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {

    var fracciones = Array<Float>(3){0f}

    for (item in arr){
        if ( item > 0){
            fracciones[0]=fracciones[0]+1
        }else if (item < 0){
            fracciones[1]=fracciones[1]+1
        }else {
            fracciones[2]=fracciones[2]+1
        }
    }

    for (i in 0..fracciones.size){
        fracciones[i]=fracciones[i]/arr.size
        println(fracciones[i])
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
