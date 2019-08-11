package June01_homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive integer number : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number!");
        } else {
            int num = 0;
            int re_num = 0;
            for (int i = 0; i < input_num; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = input_num; k > num ; k--) {
                    System.out.print("*");
                }
                num++;
                System.out.println("");
            }
            for (int x = 0; x < input_num; x++) {
                for (int y = 0; y < input_num; y++) {
                    System.out.print(" ");
                }
                for (int z = 0; z <= x; z++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
