package youaug

fun main() {

    var invest = 2500
    var discount = 13
    var amount = 0

    if (invest > 300) {
        amount = (invest * discount)/100
        println(" shopping $invest rs, You are saving $amount ")
    }else {
        print("Thanks for shopping, You have to pay $invest")
    }
}