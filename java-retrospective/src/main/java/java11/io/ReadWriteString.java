package java11.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteString {
    public static void main(String[] args) throws IOException {
        //Files.writeString()
        Path filePath = Files.writeString(Files.createTempFile("writeString_example", ".txt"), "Some text for test purposes");
        System.out.println("File path: " + filePath);

        //Files.readString()
        String fileContent = Files.readString(filePath);
        System.out.println("File content: " + fileContent);
    }
}
