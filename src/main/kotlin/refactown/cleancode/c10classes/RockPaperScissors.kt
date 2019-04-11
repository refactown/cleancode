package refactown.cleancode.c10classes

import java.lang.IllegalArgumentException

enum class Hand(val id: Char) {
    ROCK('R'),
    PAPER('P'),
    SCISSORS('S');
}

enum class Result(val value: Int) {
    LOSE(-1),
    DRAW(0),
    WIN(1);

    companion object {
        fun fromValue(value: Int): Result =
                when (value) {
                    -1 -> LOSE
                    1 -> WIN
                    0 -> DRAW
                    else -> throw IllegalArgumentException("Illegal argument value: $value")
                }
    }
}

enum class MatchResult(val firstResult: Result, val secondResult: Result) {
    FIRST_WINS(Result.WIN, Result.LOSE),
    DRAW(Result.DRAW, Result.DRAW),
    SECOND_WINS(Result.LOSE, Result.WIN);

    companion object {
        fun of(firstResult: Result): MatchResult {
            return when (firstResult) {
                Result.WIN -> FIRST_WINS
                Result.LOSE -> SECOND_WINS
                else -> DRAW
            }
        }
    }

}