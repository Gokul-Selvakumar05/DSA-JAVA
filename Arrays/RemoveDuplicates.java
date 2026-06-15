package Arrays;

import java.util.*;
/* import java.lang.*;  */ //using while collections framework

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 1, 2, 3, 1, 3 };

        /* Using LinkedHashset to remove duplicates
        LinkedHashSet removed = new LinkedHashSet<>();
        
        for (int num : arr)
        {
            removed.add(num);
        }
            System.out.print(removed);
        */

        Arrays.sort(arr);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.println(arr[k] + " ");
        }

    }
    
}