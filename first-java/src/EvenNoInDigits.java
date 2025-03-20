public class EvenNoInDigits {

    public static void main(String[] args) {
        int[] nums = {3,6,22,900,9098,8992};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        int digits = 0;
        for(int item:nums){
            digits = String.valueOf(item).length();
            if(digits % 2 ==0){
                count++;
            }
        }
        return count;
    }
}
