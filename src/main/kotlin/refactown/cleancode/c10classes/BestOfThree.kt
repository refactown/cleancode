package refactown.cleancode.c10classes

import java.lang.IllegalStateException

class BestOfThree(val match: Match, val rounds: Int = 3) {

    private var scoreFirstPlayer = 0
    private var scoreSecondPlayer = 0
    private val winnerScore = rounds / 2 + 1
    private val results = mutableListOf<MatchResult>()

    fun play() {
        for (i in 0 until rounds) {
            val matchResult = match.play()
            results.add(matchResult)
            when (matchResult) {
                MatchResult.FIRST_WINS -> scoreFirstPlayer++
                MatchResult.SECOND_WINS -> scoreSecondPlayer++
            }
            if (alreadyHasWinner()) break
        }
    }

    private fun alreadyHasWinner(): Boolean = scoreFirstPlayer >= winnerScore
            || scoreSecondPlayer >= winnerScore

    fun hasWinner() = scoreFirstPlayer != scoreSecondPlayer

    fun results() = results.toList()

    fun winner(): Player {
        return when {
            scoreFirstPlayer > scoreSecondPlayer -> match.firstPlayer
            scoreSecondPlayer > scoreFirstPlayer -> match.secondPlayer
            else -> throw IllegalStateException("There is no winner!")
        }
    }
}