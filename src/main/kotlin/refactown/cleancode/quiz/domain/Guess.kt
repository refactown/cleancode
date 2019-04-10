package refactown.cleancode.quiz.domain

data class Guess (val player: String, val question: Question, val choose: Answer, val timeInMillis: Long)
