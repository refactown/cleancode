package refactown.cleancode.c03functions


fun sett(attribute: String, value: String): Boolean    = true

fun attributeExists(attribute: String): Boolean        = true

fun setAttribute(attribute: String, value: String)     = print("")

fun main() {
    if (sett("username", "bill")) {}

    if (attributeExists("username")){
        setAttribute("username", "bill")
    }
}