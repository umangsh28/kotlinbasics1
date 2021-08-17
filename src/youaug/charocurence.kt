package youaug

import java.util.*




    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val s = sc.next()
        val s1 = java.util.HashMap<Char, Int>()
        for (element in s) {
            val ch = element
            if (!s1.containsKey(ch)) {
                s1[ch] = 1
            } else {
                val temp=s1[ch]!!
                s1[ch] = temp + 1
            }
        }
        println(s1)
    }

