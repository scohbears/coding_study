package Nov01_homework;

import java.util.Scanner;

public class homework06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = input.nextInt();
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
        finder(n,arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValue]) {
                    int temp = arr[j];
                    arr[j] = arr[minValue];
                    arr[minValue] = temp;
                }
            }
        }
    }

    public static void finder (int n, int[] arr) {
        int midIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > (n / 2)) {
                midIndex = i;
                break;
            }
        }
        System.out.println("Mid Index : " + midIndex);

        for (int i = 0; i < midIndex; i++) {
            for (int j = midIndex; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    }
}
