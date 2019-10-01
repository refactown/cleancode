package refactown.cleancode.c03functions;

public interface FileReader {

    // reads file to buffer
    public void read(String filename,  StringBuffer buffer);

    // reads file and returns
    public StringBuffer read(String filename);
}
