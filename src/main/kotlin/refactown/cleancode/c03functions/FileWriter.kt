package refactown.cleancode.c03functions

interface FileWriter {

    // Flag Argument "append"
    fun write(text: String, append: Boolean)

    // write appending
    fun writeEof(text: String)

    // overwrite
    fun writeBof(text: String)

}