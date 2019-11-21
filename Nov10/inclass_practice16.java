package Nov10;

public class inclass_practice16 {
    public static void main(String[] args) {
        int[] arr = {4,3};
        int[] tempArr = new int[2];

        tempArr[0] = arr[arr.length / 2 - 1];
        tempArr[1] = arr[arr.length / 2];

        System.out.println(tempArr[0] + " " + tempArr[1]);
    }
}
