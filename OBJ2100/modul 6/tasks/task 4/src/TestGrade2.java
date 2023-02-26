import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestGrade2 {
    private static final int DEFAULT_AMOUNT_STUDENTS = 8;

    public static void main(String[] args) {
        Map<Integer, Character> gradesByStudentId = new HashMap<>();
        fillOutGradesByStudentId(gradesByStudentId);
        displayAllStudentGrades(gradesByStudentId);
    }

    private static void fillOutGradesByStudentId(Map<Integer, Character> gradesByStudentId) {
        Scanner scanner = new Scanner(System.in);
        for (Integer id : generateStudentIds(DEFAULT_AMOUNT_STUDENTS)) {
            Character grade = promptUserForGrade(scanner, id);
            gradesByStudentId.put(id, grade);
        }
        scanner.close();
    }

    private static List<Integer> generateStudentIds(int amount) {
        return IntStream.rangeClosed(1, 8)
            .boxed()
            .collect(Collectors.toList());
    }

    private static Character promptUserForGrade(Scanner scanner, Integer studentId) {
        Character grade;
        try {
            System.out.print(String.format("Student #%d | Grade : ", studentId));
            grade = (Character) scanner.next().charAt(0);
            if (!isValidGrade(grade)) {
                String msg = String.format("'%s' is not a valid grade", grade);
                throw new GradeExeption(msg);
            }
        } catch (GradeExeption e) {
            grade = 'I';
            System.out.println(e);
        }
        return new Character(grade);
    }

    private static boolean isValidGrade(Character grade) {
        return GradeExeption.validGrades.contains(grade);
    }

    private static void displayAllStudentGrades(Map<Integer, Character> gradesByStudentId) {
        String line = String.format("%-15s | %-10s", "Student ID", "Grade");
        System.out.println(line);
        for (Map.Entry<Integer, Character> entry : gradesByStudentId.entrySet()) {
            line = String.format("%-15d | %-10c", entry.getKey(), entry.getValue());
            System.out.println(line);
        }
    }
}