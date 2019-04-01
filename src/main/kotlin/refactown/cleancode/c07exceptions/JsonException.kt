package refactown.cleancode.c07exceptions

import java.io.IOException

class JsonException : IOException{

    constructor(message: String, cause: Throwable) : super(message, cause)

    constructor(message: String) : super(message)

    constructor(cause: Throwable) : super(cause)

    companion object {

        private val serialVersionUID = 1L
    }
}