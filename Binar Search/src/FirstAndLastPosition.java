import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 7, 7, 7, 7, 18, 19, 21, 32};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = binarySearch(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(arr, target, false);
        }
        return ans;
    }

    private static int binarySearch(int[] arr, int target, boolean firstOccurance) {
        int start = 0;
        int ans = -1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstOccurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
