package Nov10;

public class inclass_practice03 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {4,2,3,1};

        System.out.println(isSame(arr1,arr2));
    }

    public static boolean isSame (int[] arr1, int[] arr2) {
        if (arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}
