import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner in1 = new Scanner(System.in);
        int num1 = in1.nextInt();
        int num2 = in1.nextInt();
        if (num1 == num2) {
            System.out.println("Both are equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
