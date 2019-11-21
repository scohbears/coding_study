package Oct19_homework;

public class Oct19_homework01 {
    public static void main(String[] args) {
        int[] array = {4,1,3,5,2,11,6,9};
        printArray(array);
        System.out.println();

        int[] halfArray = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            halfArray[i] = array[i];
        }
        bubbleSort(halfArray);

        int[] secondHalfArray = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            secondHalfArray[i] = array[array.length / 2 + i];
        }
        reversedSort(secondHalfArray);
        System.out.println();

        int[] tempArray = new int[array.length];

        for (int i = 0; i < array.length / 2; i++) {
            tempArray[i] = halfArray[i];
        }

        for (int i = array.length / 2; i < array.length; i++) {
            tempArray[i] = secondHalfArray[i - array.length / 2];
        }

        printArray(tempArray);
    }
    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void bubbleSort (int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void reversedSort (int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
