public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 7, 11, 14, 16, 19, 21, 24, 27, 31, 35, 39, 43, 45, 49};
        int target = 24;
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        System.out.println(binarySaerch(arr, target, start, end));

    }

    private static int binarySaerch(int[] arr, int target, int start, int end) {

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
        return -1;
    }
}
