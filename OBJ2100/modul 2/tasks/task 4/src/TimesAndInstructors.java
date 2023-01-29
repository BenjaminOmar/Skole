import java.util.Scanner;

public class TimesAndInstructors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] courses = {
            {"OBJ2000", "10am", "Benjamin1"},
            {"OBJ2100", "11am", "Benjamin2"},
            {"OBJ2200", "12am", "Benjamin3"},
            {"OBJ2300", "13am", "Benjamin4"},
            {"OBJ2300", "14am", "Benjamin4"},
            {"OBJ2300", "13am", "Benjamintest"},
            {"OBJ2300", "13am", "Benjamin4"},
            {"OBJ2400", "14am", "Benjamin5"}
        };


        System.out.println("Please insert a course:");
        String inputtedCourse = input.next();
        input.close();
        System.out.println("");


        // for (int i = 0; i < courses.length; i++) {
        //     for (int j = 0; j < 1; j++) {               
        //         if (courses[i][0].equals(inputtedCourse)) {
        //             System.out.println("Course id: " + courses[i][0] + " | " + "Time: " + courses[i][1] + " | " + "Instructor: " + courses[i][2]);
        //         }
        //     }
        // } // still have to figure out how to make the error message not duplicate.

        boolean courseIsTrue = false;

        for (int i = 0; i < courses.length; i++) {               
                if (courses[i][0].equals(inputtedCourse)) {
                    System.out.println("Course id: " + courses[i][0] + " | " + "Time: " + courses[i][1] + " | " + "Instructor: " + courses[i][2]);
                    courseIsTrue = true;
                }
            }
        
        if (courseIsTrue == false) {
            System.out.println("Error - You did not input a valid course ID");
        }
    }
}
