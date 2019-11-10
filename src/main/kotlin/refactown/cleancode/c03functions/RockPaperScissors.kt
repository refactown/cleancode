package refactown.cleancode.c03functions

import java.lang.IllegalArgumentException

private val VALID_CHOICES = listOf('R', 'S', 'P') // Immutable

fun rockPaperScissors(first: Char, second: Char): Int {
    if (first !in VALID_CHOICES) {
        throw IllegalArgumentException("Invalid first choice: $first. Use $VALID_CHOICES")
    }
    if (second !in VALID_CHOICES) {
        throw IllegalArgumentException("Invalid second choice: $second. Use $VALID_CHOICES")
    }
    return if (first == 'R') {
        if (second == 'P') 1 else if (second == 'S') -1 else 0
    } else if (first == 'P') {
        if (second == 'S') 1 else if (second == 'R') -1 else 0
    } else { // S
        if (second == 'R') 1 else if (second == 'P') -1 else 0
    }
}
