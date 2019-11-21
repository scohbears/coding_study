package Nov10;

public class inclass_practice21 {
    public static void main(String[] args) {
        int[] arr = {2,1};
        int arrLength = 3;
        if (arr.length < arrLength) {
            arrLength = arr.length;
        }

        int[] newArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            newArr[i] = arr[i];
            System.out.print(newArr[i] + " ");
        }
    }
}
