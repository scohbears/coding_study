package Nov10;

public class inclass_practice02 {
    public static void main(String[] args) {
        int[] arr = {3,1,5,3,5,7,9,2,3};
        System.out.println(isSame(arr));
    }

    public static boolean isSame (int[] arr) {
        if (arr[0] == arr[arr.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}
