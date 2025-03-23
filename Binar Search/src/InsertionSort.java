import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]< arr[j-1]){
                    swapNumbers(arr,j,j-1);
                } else {
                    break;
                }

            }
            
        }
    }

    private static void swapNumbers(int[] arr, int last, int first) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
