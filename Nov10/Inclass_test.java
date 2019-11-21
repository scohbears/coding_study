package Nov10;

public class Inclass_test {
    public static void main(String[] args) {
        int[] arr = { 5, 4, -33, 4, 5, 6, 7, 8 };
        bubbleSort(arr);
        printArr(arr);
    }

    public static void printArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    int temp = arr[j];
                    arr[j] = arr[min_index];
                    arr[min_index] = temp;
                }
            }
        }
    }

    public static void insertionSort (int[] arr) {
        for (int i = 1; i< arr.length; i++) {
            int j = i;
            while (j >= 1 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void bubbleSort (int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

    }
}
