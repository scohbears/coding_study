package Oct19_homework;
import java.util.Scanner;
// 3 번만 돌려도 된다

public class Oct19_homework02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the array : ");
        int arrLength = input.nextInt();

        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter element : ");
            int element = input.nextInt();
            arr[i] = element;
        }
        printArray(arr);

        bubbleSort(arr);
        printArray(arr);

        getTopThree(arr);
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void getTopThree (int[] arr) {
        System.out.println("Biggest 3 is : ");
        System.out.print(arr[arr.length - 1] + ", ");
        System.out.print(arr[arr.length - 2] + ", ");
        System.out.print(arr[arr.length - 3]);
    }

    public static void bubbleSort (int[] array) {
        int add = 0;
        for (int i = array.length - 1; i > array.length - 4; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
            add = add + array[i];
        }
        System.out.println("Sum is " + add);
    }
}
