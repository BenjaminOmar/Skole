package testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttirbutes {
    public static void main(String[] args) {
        Path filePath = Paths.get("/Users/benjamin/Desktop/skole/Github - skole/OBJ2100/modul 7/src/testing/test.txt");

        try {
            BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("Creation time: " + attr.creationTime());
            System.out.println("Size: " + attr.size());
        }
        catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
