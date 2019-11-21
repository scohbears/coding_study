package Nov10;

public class inclass_practice19 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] newArr = new int[3];

        newArr[0] = arr[arr.length / 2 - 1];
        newArr[1] = arr[arr.length / 2];
        newArr[2] = arr[arr.length / 2 + 1];

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
