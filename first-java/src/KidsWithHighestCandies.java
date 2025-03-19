import java.util.ArrayList;
import java.util.List;

public class KidsWithHighestCandies {
    public static void main(String[] args) {
        int[] candies = {1, 4, 6, 5, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }


    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new ArrayList();
        int max = candies[0];
        for (int i = 1; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < n; i++) {
            ans.add(candies[i] + extraCandies >= max);
        }
        return ans;
    }
}
