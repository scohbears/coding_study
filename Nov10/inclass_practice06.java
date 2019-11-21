package Nov10;

public class inclass_practice06 {
    public static void main(String[] args) {
        int[] arr = {6,3,8,22,50,33,11,14,5};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = max;
            System.out.print(arr[i] + " ");
        }
    }
}
