package youaug

import java.util.*
import kotlin.collections.HashMap

fun main(){
    val sc=Scanner(System.`in`)
    val n=sc.nextInt();
    val arr=IntArray(n)
    for(i in 0 until n){
        arr[i]=sc.nextInt()
    }
    val s1=HashMap<Int,Int>()
    for(element in arr){
        if(!s1.containsKey(element)){
            s1[element]=1
        }else{
            val temp=s1[element]!!
            s1[element]=temp+1
        }
    }
    for((key,value) in s1){
        if(value==1){
            println(key)
        }
    }


}

















//
//object tester {
//    @JvmStatic
//    fun main(args: Array<String>) {
//        val sc = Scanner(System.`in`)
//        val n = sc.nextInt()
//        val arr = IntArray(n)
//        for (i in 0 until n) {
//            arr[i] = sc.nextInt()
//        }
//        val s1 = HashMap<Int, Int>()
//        for (s in arr) {
//            if (!s1.containsKey(s)) {
//                s1[s] = 1
//            } else {
//                val temp = s1[s]!!
//                s1[s] = temp + 1
//            }
//        }
//        for ((key, value) in s1) {
//            if (value == 1) {
//                println(key)
//            }
//        }
//    }
//}