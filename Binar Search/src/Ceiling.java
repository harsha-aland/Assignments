public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 18, 19, 21, 32};
        int target = 20;
        System.out.println((ceilingOfaNumber(arr, target)));
    }

    private static int ceilingOfaNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end + 1;
    }
}
