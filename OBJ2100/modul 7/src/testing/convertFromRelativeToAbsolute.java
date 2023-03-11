package testing;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class convertFromRelativeToAbsolute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;

        System.out.print("Please enter the file name >> ");
        name = "OBJ2100/modul 7/src/testing/" + input.nextLine();

        Path inputPath = Paths.get(name);

        Path fullPath = inputPath.toAbsolutePath();

        System.out.println("Full path is: " + fullPath);

    }
}
