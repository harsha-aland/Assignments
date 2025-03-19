public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 3, 4, 9};
        System.out.println(smallerNumbersThanCurrent(nums));
    }

    //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
                result[i] = count;
            }
        }
        return result;
    }
}
