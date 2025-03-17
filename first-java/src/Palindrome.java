import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String temp = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            temp = temp + name.charAt(i);
        }
        if (temp.equalsIgnoreCase(name)) {
            System.out.println("Given name is palindrome");
        } else {
            System.out.println("Given name is not a palidnrome");
        }
    }
}
