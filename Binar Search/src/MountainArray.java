public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 3, 2,1};
        System.out.println(mountainArray(arr));
    }

    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //we are in decreasing part of the array
                end =mid;
            } else {
                // we are in inreasing part of he array
                start = mid +1;
            }
        }
        return start;
    }
}
