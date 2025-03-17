import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        int numberOfDigits = number.toString().length();
        int prodcut = 1;
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            prodcut = prodcut * reminder;
            sum = sum + reminder;
            number = number / 10;
        }
        int result = prodcut - sum;
        System.out.println(" result is : " + result);
    }
}
