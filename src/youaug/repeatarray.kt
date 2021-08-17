package youaug

import java.util.*

    fun main() {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val arr = IntArray(n)
        for (i in 0 until n) {
            arr[i] = sc.nextInt()
        }
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (arr[i] == arr[j]) {
                    println(arr[i])
                    println(arr[j])
                }
            }
        }
    }
