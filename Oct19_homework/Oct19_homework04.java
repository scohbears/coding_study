package Oct19_homework;
// 같은 원소가 존재할경우

public class Oct19_homework04 {
    public static void main(String[] args) {
        int[] arr = {6,2,4,8,1,9,0,11};
        int[] tempArr = {6,2,4,8,1,9,0,11};

        printArray(arr);
        bubbleSort(arr);

        printArray(arr);
        changeToElementNum(arr, tempArr);

        printArray(arr);
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
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

    public static void changeToElementNum (int[] arr, int[] tempArr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < tempArr.length; j++) {
                if (arr[i] == tempArr[j]) {
                    arr[i] = j;
                    break;
                }
            }
        }
    }
}
