import java.util.Arrays;


public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, end);
            swap(arr, maxIndex, end);
        }
    }

    private static void swap(int[] arr, int maxIndex, int end) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
