package June15_homework;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if(input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int i = 1;
            while (i <= input_num) {
                int j = 1;
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                i++;
                System.out.println();
            }

            int a = input_num;
            while (a > 1) {
                int b = 1;
                while (b < a) {
                    System.out.print(b);
                    b++;
                }
                a--;
                System.out.println();
            }
        }
    }
}
