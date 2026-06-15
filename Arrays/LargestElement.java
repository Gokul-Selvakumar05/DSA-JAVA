package Arrays;

public class LargestElement 
{
     public static void main(String[] args)
    {

        int[] arr = { 16, 55, 39, 73, 92 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        System.out.println("The largest number is "+max);
    }
}
