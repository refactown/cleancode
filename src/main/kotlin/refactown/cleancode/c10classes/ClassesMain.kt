package refactown.cleancode.c10classes

fun main() {
    val bill = Player("Bill (First)")
    val bob = Player("Bob (Second)")
    val match = Match(bill, bob)
    val bestOf = BestOfThree(match, 5)
    bestOf.play()
    // Print Results
    if (bestOf.hasWinner()){
        println("Winner: ${bestOf.winner()}")
    } else {
        println ("Draw")
    }
    println("Results: ${bestOf.results()}")
}

