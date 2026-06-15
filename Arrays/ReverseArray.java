package Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60 };

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        /* Without using temp variable
        while (left < right)
        {
            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
            left++;
            right--;
        } */

        for (int rev : arr) {
            System.out.println(rev);
        }
    }
    
}         
