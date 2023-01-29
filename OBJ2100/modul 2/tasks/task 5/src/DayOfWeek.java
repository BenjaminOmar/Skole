import java.util.Scanner;

public class DayOfWeek {
    enum daysOfWeek {monday, tuseday, wedensday, 
        thirsday, friday, saturday, sunday()};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);    

        System.out.println("The days in the week are:");
        for (daysOfWeek day: daysOfWeek.values()) {
            System.out.print(day + " ");
        }

        System.out.println("\n What business hours do you want to see?");

        String enteredValue = input.nextLine().toLowerCase();
        input.close();

        daysOfWeek inputtedValue = daysOfWeek.valueOf(enteredValue);

        System.out.println("");

        int position = inputtedValue.ordinal();

        if (position >= 0 && position <= 4) {
            System.out.println("Business hours is 9 to 9 on " + daysOfWeek.valueOf(enteredValue));
        }
        else if (position == 5) {
            System.out.println("Business hours is 10 to 6 on " + daysOfWeek.valueOf(enteredValue));
        }
        else if (position == 6) {
            System.out.println("Business hours are 11 to 5 on " + daysOfWeek.valueOf(enteredValue));
        }
    }
}
