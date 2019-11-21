package Nov10;

public class inclass_practice15 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,2,3,1};
        int[] arr2 = {11,11,11,2,3,1,2};

        if (add(arr1) < add(arr2)) {
            printArr(arr2);
        } else {
            printArr(arr1);
        }


    }

    public static int add (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void printArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
