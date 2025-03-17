import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int factor = 1;
        if (number == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= number; i++) {
                factor = factor * i;
            }
        }
        System.out.println("factors of " + number + " is : " + factor);
    }
}
