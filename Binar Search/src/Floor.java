public class Floor {
    public static void main(String[] args) {
        int[] arr = {5, 11, 14, 16, 18, 19, 21, 32};
        int target = 4;
        System.out.println((floorOfANumber(arr, target)));
    }

    private static int floorOfANumber(int[] arr, int target) {
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
        return end;
    }
}
