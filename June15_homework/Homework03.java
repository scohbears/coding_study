package June15_homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if(input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int i = 0;
            while (i < input_num) {
                int j = input_num - 1;
                while (j > i) {
                    System.out.print(" ");
                    j--;
                }

                int k = 0;
                while (k < 2 * i + 1) {
                    System.out.print("*");
                    k++;
                }

                i++;
                System.out.println();
            }
        }
    }
}
