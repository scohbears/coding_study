package June15_homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if(input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int i = input_num;
            while (i > 0) {
                int j = i;
                while (j > 0) {
                    System.out.print(j);
                    j--;
                }
                System.out.println();
                i--;
            }

            int a = 2;
            while (a <= input_num) {
                int b = a;
                while (b > 0) {
                    System.out.print(b);
                    b--;
                }
                System.out.println();
                a++;
            }
        }
    }
}
