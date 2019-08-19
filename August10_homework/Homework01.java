package August10_homework;
import java.util.Scanner;

public class Homework01 {
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
        int [][] switchedArray = switchOrder(array);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(switchedArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] switchOrder(int[][] array) {
        for (int j = 0; j < 3; j++) {
            int store = array[0][j];
            array[0][j] = array[2][2 - j];
            array[2][2 - j] = store;
        }
        int store = array[1][0];
        array[1][0] = array[1][2];
        array[1][2] = store;

        return array;
    }
}
