package June15_homework;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if(input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int k = 0;
            while (k < input_num) {
                int i = input_num - 1;
                while (i > k) {
                    System.out.print (" ");
                    i--;
                }
                int j = k + 1;
                while (j > 0) {
                    System.out.print(j);
                    j--;
                }
                k++;
                System.out.println();
            }

            int a = 0;
            int num = input_num;
            while (a < input_num - 1) {
                int b = 0;
                while(b <= a) {
                    System.out.print(" ");
                    b++;
                }
                int c = num - 1;
                while (c > 0) {
                    System.out.print(c);
                    c--;
                }
                a++;
                num--;
                System.out.println();
            }
        }
    }
}
