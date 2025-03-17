import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = in.nextInt();
        if(input % 2 == 0) {
            System.out.println("Given number is even");
        } else  {
            System.out.println("Given number is odd");
        }
    }
}
