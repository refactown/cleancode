package refactown.cleancode.c10classes

import java.lang.Math.abs
import java.util.*

private val beatsMap = mapOf(Hand.PAPER to Hand.ROCK,
        Hand.SCISSORS to Hand.PAPER, Hand.ROCK to Hand.SCISSORS)

enum class Hand(val id: Char) {
    ROCK('R'), PAPER('P'), SCISSORS('S');

    infix fun beats(hand: Hand) = beatsMap[this] == hand

    companion object {
        fun randomHand(): Hand {
            return values()[abs(Random().ints().findFirst().asInt % 3)]
        }
    }
}

private val matchMap = mapOf(Result.WIN to MatchResult.FIRST_WINS,
        Result.DRAW to MatchResult.DRAW, Result.LOSE to MatchResult.SECOND_WINS)

enum class MatchResult(val firstResult: Result, val secondResult: Result) {
    FIRST_WINS(Result.WIN, Result.LOSE),
    DRAW(Result.DRAW, Result.DRAW),
    SECOND_WINS(Result.LOSE, Result.WIN);

    companion object {
        fun of(firstResult: Result) = matchMap[firstResult]!!
    }
}

private val resultMap = mapOf(-1 to Result.LOSE, 0 to Result.DRAW, 1 to Result.WIN)

enum class Result(val value: Int) {
    LOSE(-1), DRAW(0), WIN(1);

    companion object {
        fun of(value: Int): Result = resultMap[value]!!
    }
}

