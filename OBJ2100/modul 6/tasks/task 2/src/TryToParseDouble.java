import java.util.Scanner;

public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double finalValue = 0;
        try {
            System.out.println("please insert a string to be parsed to double: ");
            String inputtedVal = input.next();
            finalValue = Double.parseDouble(inputtedVal);

        } catch(NumberFormatException exeption) {
            System.out.println("Error, the value could not be converted to double");
            finalValue = 0;
        } finally {
            input.close();
        }

        System.out.println(finalValue);


    }
}
