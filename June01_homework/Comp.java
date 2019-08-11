package June01_homework;
import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many number are you going to put : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error!");
        } else {
            int sum_of_input_num = 0;
            int sum_of_n = 0;

            for (int j = 1; j <= input_num; j++) {
                sum_of_n = sum_of_n + j;
            }

            for (int i = 0; i < input_num - 1; i++) {
                System.out.print("Enter number between 1 ~ input number : ");
                int n = input.nextInt();
                if (n > input_num) {
                    System.out.println("Error!");
                } else if (n <= 0) {
                    System.out.println("Error!");
                } else {
                    sum_of_input_num = sum_of_input_num + n;
                }

            }

            System.out.print("Your missing number is : ");
            System.out.println(sum_of_n - sum_of_input_num);
        }

    }
}
