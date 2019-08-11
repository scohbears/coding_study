package June15_homework;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            Integer min = Integer.MAX_VALUE;
            Integer max = Integer.MIN_VALUE;

            int i = 0;
            while (i < input_num) {
                System.out.print("Enter integer number to put in : ");
                int input_data = input.nextInt();

                if (input_data < min) {
                    min = input_data;
                } else if (input_data > max) {
                    max = input_data;
                }
                i++;
            }
            System.out.println("Minimum value is : " + min);
            System.out.println("Maximum value is : " + max);
        }
    }
}
