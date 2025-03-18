import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HCFusingEuclidein {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        if(number2 > number1){
            int temp = number2;
            number2 = number1;
            number1 = temp;
        }
        int reminder = number1 % number2;
        List<Integer> reminders = new ArrayList<>();
        reminders.add(reminder);
        while (reminder != 0) {
            reminder = number2 % reminder;
            reminders.add(reminder);
        }
        reminders.stream().sorted();
        System.out.println(reminders.get(0));
    }
}
