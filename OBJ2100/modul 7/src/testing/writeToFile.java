package testing;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;

public class writeToFile {
    public static void main(String[] args) {
        Path file = Paths.get("/Users/benjamin/Desktop/skole/Github - skole/OBJ2100/modul 7/src/testing/test.txt");
        
        String writing = "Test";

        byte[] data = writing.getBytes();

        OutputStream output = null;

        try {
            output = new BufferedOutputStream(Files.newOutputStream(file, WRITE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch(IOException e) {
            System.out.println("error");
        }
    }
}
