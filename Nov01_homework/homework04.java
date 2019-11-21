package Nov01_homework;

import java.util.Scanner;

public class homework04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String value to search : ");
        String searchString = input.nextLine();
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

        System.out.println(counter(searchString, arr));
    }

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort (String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j >= 1 && arr[j].compareTo(arr[j - 1]) < 0) {
                String temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static int counter (String searchString, String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchString)) {
                for (int j = i; i < arr.length; j++) {
                    if (!arr[j].equals(searchString)) {
                        break;
                    }
                    count++;
                }
                i = i + count - 1;
            }
        }
        return count;
    }
}
