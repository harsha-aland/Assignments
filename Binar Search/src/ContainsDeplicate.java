public class ContainsDeplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }

    static boolean containsDuplicate(int[] nums) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < nums.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (nums[j] < nums[j-1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
        for(int i= 0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
