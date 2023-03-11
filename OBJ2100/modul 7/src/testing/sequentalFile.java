package testing;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class sequentalFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Path file = Paths.get("/Users/benjamin/Desktop/skole/Github - skole/OBJ2100/modul 7/src/testing/test.txt");

        int QUIT = 99;
        String sending = "";

        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            System.out.print("Please enter a employee number >> ");
            int id = input.nextInt();


            while(id != QUIT) {
                input.nextLine();
                System.out.println("Please enter name of employee:");
                String name = input.nextLine();

                System.out.println("enter payrate:");
                double payrate = input.nextDouble();

                sending = id + "." + name + "." + payrate;
                writer.write(sending, 0, sending.length());
                writer.newLine();
                System.out.println("Enter next id number or type: " + QUIT + " to quit");
                id = input.nextInt();
            }
            writer.close();
            writer.flush();
            input.close();
        }
        catch(IOException e) {
            System.out.println("Error");
        }
    }
}
