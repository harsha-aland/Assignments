import java.util.Scanner;

public class SumOfAllTillUserHitsZero {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int temp = in.nextInt();
        while (temp>0){
            sum = sum + temp;
            temp = in.nextInt();
        }
        System.out.println(sum);
    }
}
