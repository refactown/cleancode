package refactown.cleancode.c10classes

import refactown.cleancode.c03functions.rockPaperScissors

class Match(val fisrtPlayer: Player, val secondPlayer: Player) {

    fun play(): MatchResult{
        val first: Char = fisrtPlayer.play().id
        val second: Char = secondPlayer.play().id
        val result = rockPaperScissors(first, second)
        val firstResult = Result.fromValue(result)
        return MatchResult.of(firstResult)
    }
}

