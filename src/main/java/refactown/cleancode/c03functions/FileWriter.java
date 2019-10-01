package refactown.cleancode.c03functions;

public interface FileWriter {

    // Flag Argument "append"
    public void write(String text, boolean append);

    // write appending
    public void writeEof(String text);

    // overwrite
    public void writeBof(String text);
}
