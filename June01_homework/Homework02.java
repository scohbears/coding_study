package June01_homework;

import java.util.Scanner;

public class Homework02 {
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
                for (int k = num; k > 0; k--) {
                    System.out.print(k);
                }
                num++;
                System.out.println("");
            }

            for (int a = 1; a < input_num; a++) {
                for (int b = 1; b <= a; b++) {
                    System.out.print(" ");
                }
                for (int c = re_num - 1; c > 0; c--) {
                    System.out.print(c);
                }
                re_num--;
                System.out.println("");
            }
        }
    }
}
