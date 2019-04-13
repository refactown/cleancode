package refactown.cleancode.c03functions

interface FileReader{

    // reads file to buffer
    fun read(filename: String, buffer: StringBuffer)

    // reads file and returns
    fun read(filename: String): StringBuffer

}

