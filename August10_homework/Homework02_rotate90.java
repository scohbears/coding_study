package August10_homework;
import java.util.Scanner;

public class Homework02_rotate90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter an element : ");
                int element = input.nextInt();
                array[i][j] = element;
            }
        }

        int[][] switchedArray = switchOrder(array);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(switchedArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] switchOrder (int[][] array) {
        int[][] switchedArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switchedArray[i][j] = array[2 - j][i];
            }
        }
        return switchedArray;
    }
}
