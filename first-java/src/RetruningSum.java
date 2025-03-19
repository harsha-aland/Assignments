import java.util.Arrays;

public class RetruningSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(returningSum(nums)));
    }

    private static int[] returningSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] runningSum = new int[n];
        for(int i = 0; i<n ; i++ ){
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
