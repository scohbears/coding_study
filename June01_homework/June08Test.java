package June01_homework;

import java.util.Scanner;

public class June08Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int num = 0;
            int re_num = input_num;

            for (int a = 0; a < ((2 * input_num - 1) + 2); a++) {
                System.out.print("#");
            }
            System.out.println("");

            for (int i = 0; i < input_num; i++) {
                System.out.print("#");
                for (int j = num; j < input_num - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * num + 1); k++) {
                    System.out.print("*");
                }
                for (int l = num; l < input_num - 1; l++) {
                    System.out.print(" ");
                }
                num++;
                System.out.println("#");
            }

            for (int x = 1; x < input_num; x++) {
                System.out.print("#");
                for (int y = 0; y < x; y++) {
                    System.out.print(" ");
                }
                for (int z = (2 * (re_num - 1) - 1) ; z > 0; z--) {
                    System.out.print("*");
                }
                for (int w = 0; w < x; w++) {
                    System.out.print(" ");
                }
                re_num--;
                System.out.println("#");
            }
            for (int b = 0; b < ((2 * input_num - 1) + 2); b++) {
                System.out.print("#");
            }
        }
    }
}
//n = 4
//        #########
//        #   *   #
//        #  ***  #
//        # ***** #
//        #*******#
//        # ***** #
//        #  ***  #
//        #   *   #
//        #########