package task1;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileStatistics {
    public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("/Users/benjamin/Desktop/test.txt");

        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("filename is: " + path.getFileName());

        System.out.println("the file is in folder: " + path.getParent());

        System.out.println("The file is: " + (attr.size() / 1024) + " kilobytes");

        System.out.println("the file is last modified: " + attr.lastModifiedTime());

        
    }
}
