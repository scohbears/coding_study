package Nov10;

public class inclass_practice01 {
    public static void main(String[] args) {
        int[] arr = {7,1,4,2,6};
        sort(arr);
        System.out.print(isSeven(arr));

    }

    public static void sort (int[] arr) {
        for (int i  = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
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

    public static boolean isSeven (int[] arr) {
        if (arr[0] == 7 || arr[arr.length - 1] == 7) {
            return true;
        } else {
            return false;
        }
    }
}
