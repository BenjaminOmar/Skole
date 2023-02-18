import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] firstNames = {"Benjamin0", "Benjamin1", "Benjamin2", "Benjamin3", "Benjamin4", "Benjamin5", "Benjamin6", "Benjamin7"};

        try {
            System.out.println("Please insert the position you want to see: ");
            int position = input.nextInt();
    
            System.out.println("The index " + position + " contains the name: " + firstNames[position]);
        } catch(ArrayIndexOutOfBoundsException exeption) {
            System.out.println("The index inserted was out of bounds for the array");
        } finally {
            input.close();
        }
    }

}
