package Arrays;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) 
    {
        int arr[] = { 12, 34, 78, 98, 45, 88 };
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("The Secondest largest number is " + arr[n - 2]);
    }
    
}
