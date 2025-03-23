public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num+1 ;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid;
            } else if (mid * mid < num) {

                start = mid + 1;
            }
        }
        return false;
    }
}
