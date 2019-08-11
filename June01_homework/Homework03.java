package June01_homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive integer number : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number!");
        } else {
            int num = 1;

            for (int i = input_num - 1; i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 2 * num - 1; k > 0; k--) {

                    System.out.print("*");
                }
                num++;
                System.out.println("");
            }
        }
    }
}