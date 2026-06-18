package String;

public class FindDifference {

    public static char findTheDifference(String s, String t) {

        int sum = 0;

        for (char ch : t.toCharArray()) {
            sum += ch;
        }

        for (char ch : s.toCharArray()) {
            sum -= ch;
        }

        return (char) sum;
    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        char result = findTheDifference(s, t);

        System.out.println("Added character: " + result);
    }
}

