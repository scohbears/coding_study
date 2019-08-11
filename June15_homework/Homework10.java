package June15_homework;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many element are you going to put in ? Enter number : ");
        int input_num = input.nextInt();

        int[] arr = new int[input_num];

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int i = 0;
            while (i < arr.length) {
                System.out.print("Enter integer number for element arr[" + i + "] : ");
                int input_element = input.nextInt();
                arr[i] = input_element;
                i++;
            }

            System.out.print("Enter how many are you going to enter to find a element : ");
            int input_finder = input.nextInt();


            if (input_finder <= 0) {
                System.out.println("Error! Please enter positive integer number !");
            } else {
                int j = 0;
                while (j < input_finder) {
                    boolean finded = false;
                    System.out.print("Enter element to find : ");
                    int finder = input.nextInt();

                    int k = 0;
                    while (k < arr.length) {
                        if (finder == arr[k]) {
                            finded = true;
                        }
                        k++;
                    }
                    j++;
                    if(finded) {
                        System.out.println("Found!");
                    } else {
                        System.out.println("Not Found!");
                    }
                }

            }
        }
    }
}
