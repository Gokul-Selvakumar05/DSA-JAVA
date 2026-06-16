package Arrays.String;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String result = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (result.indexOf(ch) != -1) {
                    break;
                }
                result += ch;
                max = Math.max(max, result.length());
            }
        }
        return max;

    }
    
    public static void main(String[] args) {
        String s = "abcbacbaa";
        LongestSubstring ls = new LongestSubstring();
        System.out.print(ls.lengthOfLongestSubstring(s));
    
    }
}
