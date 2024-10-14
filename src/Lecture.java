import java.io.IOException;

public interface Lecture {
    void getContent() throws IOException;
    void palindromeFile() throws IOException;
    void returnFile() throws IOException;
    boolean compareFile(Files f);
}
