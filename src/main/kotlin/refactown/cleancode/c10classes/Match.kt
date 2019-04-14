package refactown.cleancode.c10classes

import refactown.cleancode.c03functions.rockPaperScissors

open class Match(val firstPlayer: Player,
                 val secondPlayer: Player) {

    open fun play(): MatchResult {
        val first: Char = firstPlayer.play().id
        val second: Char = secondPlayer.play().id
        val result = rockPaperScissors(first, second)
        val firstResult = Result.of(result)
        return MatchResult.of(firstResult)
    }
}

class SmartMatch(firstPlayer: Player, secondPlayer: Player)
    : Match(firstPlayer, secondPlayer) {

    override fun play(): MatchResult {
        val firstHand = firstPlayer.play()
        val secondHand = secondPlayer.play()
        return when {
            firstHand.beats(secondHand) -> MatchResult.FIRST_WINS
            secondHand.beats(firstHand) -> MatchResult.SECOND_WINS
            else -> MatchResult.DRAW
        }
    }
}
