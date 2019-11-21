package Nov10;

public class inclass_practice18 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,67,3,4,1};

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
