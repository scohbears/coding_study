package June08_homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many element are you going to enter ? : ");
        int input_num = input.nextInt();
        int[] arr = new int[input_num];

        if(input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element : ");
                int element = input.nextInt();
                arr[i] = element;
            }
        }

        System.out.println();
        System.out.print("How many number are you going to enter ? : ");
        int input_finder = input.nextInt();

        if(input_finder <= 0) {
            System.out.println("Error! Do not enter negative number !");
        } else {
            for (int i = 0; i < input_finder; i++) {
                boolean found = false;
                System.out.print("Enter number : ");
                int finder = input.nextInt();

                for (int j = 0; j < input_num; j++) {
                    if (finder == arr[j]) {
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
