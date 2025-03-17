import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        System.out.println("Please enter principle");
        Scanner input1 = new Scanner(System.in);
        double principle = input1.nextDouble();
        System.out.println("Please enter rate");
        double rate = input1.nextDouble();
        System.out.println("please enter time in year");
        double time = input1.nextDouble();

        double si = (principle * rate * time) / 100;

        System.out.println("Simple interest : " + si);
    }
}
