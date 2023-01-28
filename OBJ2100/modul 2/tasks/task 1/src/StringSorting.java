import java.util.Arrays;

public class StringSorting {

    public static void main(String[] args) {
        String [] alphabet = {"G", "C", "A", "F", "B", "S", "W", "L", "M", "N", "O"};   
        
        StringSorting s = new StringSorting();

        s.sort(alphabet);

    }

    public void sort(String[] array)
    {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}


