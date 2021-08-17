package youaug

import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = sc.nextInt()
    }
    for (i in arr.indices.reversed()) {
        println(arr[i])
    }
}