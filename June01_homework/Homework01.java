package June01_homework;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive integer number : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number!");
        } else {
            for (int i = 1; i <= input_num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println("");
            }
            for (int a = (input_num - 1); a > 0; a--) {
                for (int b = 1; b <= a; b++) {
                    System.out.print(b);
                }
                System.out.println("");
            }
        }
    }
}
