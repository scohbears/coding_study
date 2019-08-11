package July31_homework;
import java.util.Scanner;

public class Roll_The_Dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1 <= n <= 1000) : ");
        int num1 = input.nextInt();
        System.out.print("Enter a number (1 <= n <= 1000) : ");
        int num2 = input.nextInt();

        if (isInRange(num1, num2)) {
            System.out.print("There is " + rollTheDice(num1, num2) + " way to get the sum 10.");
        } else {
            System.out.println("Error! One or two number is not in the range!");
        }
    }

    public static boolean isInRange(int num1, int num2) {
        if (num1 >= 1 && num1 <= 1000) {
            if (num2 >= 1 && num2 <= 1000) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int rollTheDice(int num1, int num2) {
        int length1 = 10;
        int length2 = 10;

        if (length1 > num1) {
            length1 = num1;
        }
        if (length2 > num2) {
            length2 = num2;
        }

        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == 10) {
                    count++;
                }
            }
        }
        return count;
    }
}
