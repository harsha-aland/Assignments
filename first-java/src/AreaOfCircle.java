import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of a circle is: "+ area);
    }
}
