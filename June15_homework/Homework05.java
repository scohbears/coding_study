package June15_homework;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if(input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int i = 0;
            while (i < input_num) {
                int j =  0;
                while (j < i) {
                    System.out.print(" ");
                    j++;
                }
                int k = input_num;
                while (k > i) {
                    System.out.print("*");
                    k--;
                }
                System.out.println();
                i++;
            }

            int a = 0;
            while (a < input_num) {
                int b = 0;
                while (b < input_num) {
                    System.out.print(" ");
                    b++;
                }
                int y = 0;
                while (y <= a) {
                    System.out.print("*");
                    y++;
                }
                System.out.println();
                a++;
            }
        }
    }
}

