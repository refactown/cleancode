package refactown.cleancode.c03functions

import java.lang.IllegalArgumentException

private val VALID_CHOOSES = listOf('R', 'S', 'P') // Immutable

fun rockPaperScissors(first: Char, second: Char): Int {
    if (first !in VALID_CHOOSES) {
        throw IllegalArgumentException("Invalid first choose: $first. Use $VALID_CHOOSES")
    }
    if (second !in VALID_CHOOSES) {
        throw IllegalArgumentException("Invalid second choose: $second. Use $VALID_CHOOSES")
    }
    return if (first == 'R') {
        if (second == 'P') 1 else if (second == 'S') -1 else 0
    } else if (first == 'P') {
        if (second == 'S') 1 else if (second == 'R') -1 else 0
    } else { // S
        if (second == 'R') 1 else if (second == 'P') -1 else 0
    }
}
