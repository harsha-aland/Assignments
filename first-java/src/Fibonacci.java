import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(first + ",");
            int result = first + second;
            first = second;
            second = result;

        }
    }
}
