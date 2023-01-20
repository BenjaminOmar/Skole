import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        
        InsertionSort i = new InsertionSort();

        int[] number = {1,6,4,2,8,3};

        i.sort(number);

        System.out.println(Arrays.toString(number));
    }

    // with a while loop

    public void sort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;

        }
    }

/*  tutorial:
        https://www.youtube.com/watch?v=0lOnnd50cGI&ab_channel=CodingwithJohn
*/
}
