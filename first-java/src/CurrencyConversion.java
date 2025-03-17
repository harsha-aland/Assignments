import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {
        System.out.println("enter amount in rupees");
        Scanner in = new Scanner(System.in);
        float rupees = in.nextFloat();
        System.out.println("Current USD value against 1 rupee is 85");
        float usd = rupees * 85;
        System.out.println("USD value of " + rupees + " is " + usd );
    }
}
