package refactown.cleancode.quiz.domain

import java.time.LocalDateTime

class Round (val begin: LocalDateTime, val end: LocalDateTime= LocalDateTime.MAX,
                                  val skipped: Boolean=false){

}
