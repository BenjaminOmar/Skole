import java.util.Arrays;
import java.util.Scanner;

public class TestGrade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentId = {1,2,3};
        char[] gradeForStudent = {'b','b','b'};
        
        for (int i = 0; i < studentId.length; i++) {
            System.out.println("Please insert a grade for student: " + studentId[i]);

            try {
                
                gradeForStudent[i] = input.next().toUpperCase().charAt(0);

                if (!GradeExeption.validGrades.contains(gradeForStudent[i])) {
    
                    gradeForStudent[i] = 'I';
                    System.out.println(gradeForStudent);
                    throw new GradeExeption("The grade given is not valid");
                }
            } catch(GradeExeption gradeExeption) {
                System.out.println("--------");
                System.out.println(gradeExeption.getMessage());
                System.out.println("--------");
            }
        }
        input.close(); 
        System.out.println("Student: " + studentId[0] + " got the grade: " + gradeForStudent[0]);
        System.out.println("Student: " + studentId[1] + " got the grade: " + gradeForStudent[1]);
        System.out.println("Student: " + studentId[2] + " got the grade: " + gradeForStudent[2]);
    }
}
