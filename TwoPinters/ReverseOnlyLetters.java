package TwoPinters;

public class ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer until a letter is found
            while (left < right && !Character.isLetter(arr[left])) {
                left++;
            }

            // Move right pointer until a letter is found
            while (left < right && !Character.isLetter(arr[right])) {
                right--;
            }

            // Swap letters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s1 = "ab-cd";
        String s2 = "a-bC-dEf-ghIj";
        String s3 = "Test1ng-Leet=code-Q!";

        System.out.println(reverseOnlyLetters(s1));
        System.out.println(reverseOnlyLetters(s2));
        System.out.println(reverseOnlyLetters(s3));
    }

}
