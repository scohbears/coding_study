package Nov01_homework;
import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int arrSize = input.nextInt();

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter element : ");
            int element = input.nextInt();
            arr[i] = element;
        }

        sort(arr);
        printArr(arr);

        printMidiumValue(arr);
    }

    public static void printArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void printMidiumValue (int[] arr) {
        System.out.print("Midium value of this array is : ");
        if (arr.length % 2 == 1) {
            System.out.println(arr[arr.length / 2]);
        } else {
            // ㅅㅗ수점
            System.out.println((arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2);
        }
    }
}
