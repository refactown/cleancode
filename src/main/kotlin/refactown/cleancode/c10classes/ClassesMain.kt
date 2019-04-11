package refactown.cleancode.c10classes

fun main() {
    val bill = Player("Bill (First)")
    val bob = Player("Bob (Second)")
    val bestOf3 = BestOfThree(bill, bob, 5)
    bestOf3.play()
    if (bestOf3.hasWinner()){
        println("Winner: ${bestOf3.winner()}")
    } else {
        println ("Draw between ${bestOf3.firstPlayer} and ${bestOf3.secondPlayer}")
    }
    println("Results: ${bestOf3.results()}")
}