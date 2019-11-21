package Oct19_homework;

public class sortPractice01 {
    public static void main(String[] args) {
        int[] array = {4,1,3,5,2,11,6,9};
        printArray(array);
        System.out.println();

//        selectionSort(array);
//        System.out.print("Selection sort : ");
//        printArray(array);
//        System.out.println();

//        insertionSort(array);
//        System.out.print("Insertion sort : ");
//        printArray(array);
//        System.out.println();

        bubbleSort(array);
        System.out.print("Bubble sort : ");
        printArray(array);
        System.out.println();
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    int temp = array[j];
                    array[j] = array[min_index];
                    array[min_index] = temp;
                }
            }
        }
    }

    public static void insertionSort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j >= 1 && array[j] < array[j - 1]) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
    }

    public static void bubbleSort (int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
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
        }
    }
}


