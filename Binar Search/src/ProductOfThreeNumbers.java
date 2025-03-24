public class ProductOfThreeNumbers {

    public static void main(String[] args) {
        int[] nums = {-1,-2,1,2,3};
        System.out.println(maximumProduct(nums));
    }

    static int maximumProduct(int[] nums) {
        int n = nums.length-1;
        int prod = 1;
        boolean swapped;
        for(int i = 0; i<n;i++){
            swapped = false;
            for(int j=1; j<n-i;j++){
                if(Math.abs(nums[j]) < Math.abs(nums[j-1])){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        prod = nums[n] * nums[n-1] * nums[n-2];
        return prod;
    }
}
