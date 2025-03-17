import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Scanner input3 = new Scanner(System.in);

        double num1 = input1.nextDouble();
        double num2 = input2.nextDouble();
        System.out.println("Enter the operator");
        String operator = input3.nextLine();
        double result = 0;

        if (operator.equalsIgnoreCase("+")) {
            result = num1 + num2;
        } else if (operator.equalsIgnoreCase("-")) {
            result = num1 - num2;
        } else if (operator.equalsIgnoreCase("*")) {
            result = num1 * num2;
        } else if (num2 != 0 && operator.equalsIgnoreCase("/")) {
            result = num1 / num2;
        }
        System.out.println("Result is : " + result);
    }
}
