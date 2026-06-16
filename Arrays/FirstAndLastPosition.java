package Arrays;

public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[] { first, last };
    }
    
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 1, 2 };
        int target = 2;
        FirstAndLastPosition f = new FirstAndLastPosition();
        System.out.println(f.searchRange(nums, target));
    }
}
