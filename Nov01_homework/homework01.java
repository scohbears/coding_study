package Nov01_homework;
import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int arrSize = input.nextInt();

        String[] arr = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter element : ");
            String element = input.next();
            arr[i] = element;
        }

        sort(arr);
        printArr(arr);

        reverseSort(arr);
        printArr(arr);
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void reverseSort(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
