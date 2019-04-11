package refactown.cleancode.quiz.domain

import java.time.LocalDateTime
import java.util.*

fun startGame(pin: String, quiz: Quiz, startTime: LocalDateTime, owner: User, players: SortedSet<String>): Game =
        Game(pin, quiz, startTime, owner, players)

class Game(val pin: String, val quiz: Quiz, val startTime: LocalDateTime, val owner: User, val players: SortedSet<String>) {
    var finishTime: LocalDateTime = LocalDateTime.MAX
    val isFinished: Boolean get() = finishTime != LocalDateTime.MAX
    val rounds = mutableListOf<Round>()
    var roundIndex = -1

    fun startNextRound(): Round {
        roundIndex++
        val newRound = Round(LocalDateTime.now())
        rounds[roundIndex] = newRound
        return newRound
    }

    fun finish(finishTime: LocalDateTime) {
        validateBeforeFinish(finishTime)
        this.finishTime = finishTime
    }

    private fun validateBeforeFinish(finishTime: LocalDateTime) {
        if (isFinished) throw IllegalStateException("Match already finished!")
    }

    fun currentRound(): Round = rounds[roundIndex]

}