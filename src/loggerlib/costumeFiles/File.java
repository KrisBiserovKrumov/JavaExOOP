package loggerlib.costumeFiles;

public interface File {
    void write();
    int getSize();
    void appendBuffer(String text);
}
