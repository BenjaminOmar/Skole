package task2;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CompareFolders {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        Path file1 = Paths.get("/test1.txt");

        System.out.println(file1.getNameCount());

        System.out.println("the file is in folder: " + file1.getParent().toString());
    }
}
