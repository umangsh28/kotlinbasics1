fun main(){
    val score= arrayOf(10,12,2,1,25)

    var low=score[0]

    for(i in score){
        if(i < low){
            low=i
        }


    }
    print(low)

}