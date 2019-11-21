package Nov10;

public class inclass_practice17 {
    public static void main(String[] args) {
        int[] arr1 = {3,2,6,5,3,1};
        int[] arr2 = {6,6,5,8,3,2,1,1};
        int[] combinedArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            combinedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArr[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < combinedArr.length; i++) {
            System.out.print(combinedArr[i] + " ");
        }
    }
}
