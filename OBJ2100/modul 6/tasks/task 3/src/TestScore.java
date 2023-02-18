import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentId = {1,2,3};
        int[] studentScore = {0,0,0};

        for (int i = 0; i < studentId.length; i++) {
        try {
            System.out.println("Please insert the test score for the students: ");  
      
            System.out.print("Student " + studentId[i] + ": ");
            studentScore[i] = input.nextInt();

            if (studentScore[i] > 100 || studentScore[i] < 0) {
                studentScore[i] = 0;
                throw new ScoreExeption("ERROR - Student " + (i + 1) + " has to get a score between 0-100. Score set to 0");
            }
        } catch(ScoreExeption scoreExeption) {
            System.out.println();
            System.out.println("---");
            System.out.println(scoreExeption.getMessage());
            System.out.println("---");
            System.out.println();
        }
    }
    input.close();
    
        System.out.println();
        System.out.println("Student " + studentId[0] + " got " + studentScore[0]);
        System.out.println("Student " + studentId[1] + " got " + studentScore[1]);
        System.out.println("Student " + studentId[2] + " got " + studentScore[2]);
    }
}
