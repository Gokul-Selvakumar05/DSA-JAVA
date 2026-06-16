package String;

public class ReverseString {
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.split("\\s+");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i] + " ";
        }

        return result.trim();
    }
    
    public static void main(String[] args) {
        String s = "Hi Guyzz How are you";
        ReverseString r = new ReverseString();
        System.out.println(r.reverseWords(s));
    }
}

