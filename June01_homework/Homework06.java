package June01_homework;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive integer number : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number!");
        } else {
            int num = 1;
            int re_num = input_num;

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
            for (int x = 1; x <= input_num; x++) {
                for (int y = 0; y < x; y++) {
                    System.out.print(" ");
                }
                for (int z = (2 * (re_num - 1) - 1); z > 0; z--) {
                    System.out.print("*");
                }
                re_num--;
                System.out.println("");
            }
        }
    }
}
