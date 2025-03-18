import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {
        //iterate over 2 to n-1
        if (num < 1) {
            return false;
        }
        for (int i = 2; i < num - 1; i++) {
            if (num % i != 0) {
                return true;
            }
        }

        return false;
    }
}
