package Nov10;

public class inclass_practice08 {
    public static void main(String[] args) {
        int[] arr1 = {3,2,1,5,3};
        int[] arr2 = {3,3,3,5,6,2,7};
        int[] arr = new int[2];

        arr[0] = arr1[arr1.length / 2];
        arr[1] = arr2[arr2.length / 2];

        System.out.println(arr[0] + " " + arr[1]);
    }
}
