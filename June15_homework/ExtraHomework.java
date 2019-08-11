package June15_homework;
import java.util.Scanner;

public class ExtraHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter positive integer number : ");
            int input_num = input.nextInt();

            if (input_num <= 0) {
                System.out.println("Error! Please enter positive integer number!");
                break;
            } else {
                int sum = 0;
                int i = input_num;
                while (i > 0) {
                    sum = sum + i;
                    i--;
                }
                System.out.println("Sum from " + input_num + " to 1 is : " + sum);
            }
        }
    }
}
