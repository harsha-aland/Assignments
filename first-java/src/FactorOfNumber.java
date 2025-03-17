import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextInt();
        for (int i= 1; i<= (number);i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
