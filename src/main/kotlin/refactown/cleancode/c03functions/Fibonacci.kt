package refactown.cleancode.c03functions

fun fib(x: Int): Int = if (x in 0..1) x else fib(x - 1) + fib(x - 2)

fun seq(x: Int): String = if (x == 0) "0" else ""+seq(x-1) + "," + fib(x)