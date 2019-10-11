package refactown.cleancode.c10classes

import refactown.cleancode.c03functions.rockPaperScissors

fun main() {
    val rounds = 5
    var scoreBill = 0
    var scoreBob = 0
    val results = mutableListOf<MatchResult>()
    var firstResult: Result?
    var matchResult: MatchResult?
    for (i in 0 until rounds) {
        var billHand = Hand.randomHand()
        var bobHand = Hand.randomHand()
        firstResult = Result.of(rockPaperScissors(billHand.id, bobHand.id))
        matchResult = MatchResult.of(firstResult)
        when (matchResult) {
            MatchResult.FIRST_WINS -> scoreBill++
            MatchResult.SECOND_WINS -> scoreBob++
        }
        results.add(matchResult)
    }
    // Print Results
    if (scoreBill > scoreBob) {
        println("Winner: Bill")
    } else if (scoreBob > scoreBill) {
        println("Winner: Bob")
    } else {
        println("Draw")
    }
    println("Results: ${results}")
}