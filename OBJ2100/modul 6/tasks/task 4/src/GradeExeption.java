import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GradeExeption extends Exception {
    
    public static final List<Character> validGrades = Collections.unmodifiableList(
        Arrays.asList('A', 'B', 'C', 'D', 'F', 'I'));
    
        public GradeExeption(String message) {
        super(message);
    }
}
