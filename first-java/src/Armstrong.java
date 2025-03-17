import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        double originalNumber = number;
        double numberOfDigits = number.toString().length();
        double result = 0;
        while (number > 0) {
            double temp = number % 10;
            temp = Math.pow(temp, numberOfDigits);
            result = result + temp;
            number = number / 10;
        }
        if (result == originalNumber) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
