import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
       int[] numbers = {7,3,1,4,6, 4, 3, 10, 17};

       BubbleSort a = new BubbleSort();

    // prints

    a.sort(numbers);

    System.out.println(Arrays.toString(numbers));

    a.sort2(numbers);

       System.out.println(Arrays.toString(numbers));

       a.sort3(numbers);

       System.out.println(Arrays.toString(numbers));
        
        
    }

    // ---- The different methods for using bubblesort ----

    // easiest way

    public void sort(int[] array)
        {
            for (int i : array)
            {
                for (int j = 1; j < array.length; j++)
                {
                    if (array[j] < array[j -1])
                    {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }
        }

    // if you go the oposite way    

    public void sort2(int[] array)
    {
        for (int i : array)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[i];
                    array[j] = array[j +1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // another way of moving the elements inn the array

    public void sort3(int[] array)
    {
        for (int i : array)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[i + 1];
                    array[j +1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
