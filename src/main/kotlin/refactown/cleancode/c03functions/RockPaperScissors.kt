package refactown.cleancode.c03functions

import java.lang.IllegalArgumentException

val VALID_CHOOSES = listOf('R', 'S', 'P')

fun rockPaperScissors(first: Char, second: Char): Int {
    if (first !in VALID_CHOOSES) {
        throw IllegalArgumentException("Invalid first chhose: $first. Use $VALID_CHOOSES")
    }
    if (second !in VALID_CHOOSES) {
        throw IllegalArgumentException("Invalid secind chhose: $first. Use $VALID_CHOOSES")
    }
    return if (first == 'R') {
        if (second == 'P') 1 else if (second == 'S') -1 else 0
    } else if (first == 'P') {
        if (second == 'S') 1 else if (second == 'R') -1 else 0
    } else { // S
        if (second == 'R') 1 else if (second == 'P') -1 else 0
    }
}
