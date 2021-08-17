package youaug

import java.util.*

fun main(){
    val sc=Scanner(System.`in`)
    val n=sc.nextInt()
    val arr=IntArray(n)
    for(i in 0 until n){
        arr[i]=sc.nextInt()
    }
    var sum=0
    var avg=0;
    for(element in arr){
        sum+=element
    }
    avg=sum/n
    println(avg)


}