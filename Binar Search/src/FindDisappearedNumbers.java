import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i]!= nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList();
        for(int j= 0; j<nums.length;j++){
            if(nums[j] != j+1){
                result.add(j+1);
            }
        }
        return result;
    }
}
