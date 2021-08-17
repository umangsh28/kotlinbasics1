package youaug

import java.util.*

fun main(){
    val sc= Scanner(System.`in`)
    val s=sc.nextInt()
    val d=sc.nextInt()


    for (i in s downTo 0 step d) {
        println(i)
    }


}