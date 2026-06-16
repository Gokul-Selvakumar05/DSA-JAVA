package String;
class FirstOccurranceIndex {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String word = "iwanttobeanjavadeveloper";
        String search = "java";
        FirstOccurranceIndex f = new FirstOccurranceIndex();
        System.out.print(f.strStr(word, search));

    }
}