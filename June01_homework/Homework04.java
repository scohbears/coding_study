package June01_homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive integer number : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number!");
        } else {
            int num = input_num;
            int re_num = 2;

            for (int i = input_num; i > 0; i--) {
                for (int j = num; j > 0; j--) {
                    System.out.print(j);
                }
                num--;
                System.out.println("");
            }
            for (int x = 2; x <= input_num; x++) {
                for (int y = re_num; y > 0; y--) {
                    System.out.print(y);
                }
                re_num++;
                System.out.println("");
            }
        }
    }
}
