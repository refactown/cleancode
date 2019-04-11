package refactown.cleancode.quiz.service

import java.time.LocalDateTime

data class GuessEvent(val gamePin: String, val roundNumber: Int, val nickname: String, val choose: Int ,
                      val moment: LocalDateTime)