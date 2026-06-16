package String;

public class LastWordLength {
    public int lengthOfLastWord(String s) {
        String result = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            result = arr[arr.length - 1];
        }
        return result.length();
    }
    public static void main(String[] args) {
    String s = "Hello I am Gokul Selvakumar";
    LastWordLength l = new LastWordLength();
    System.out.println(l.lengthOfLastWord(s));
}
}

