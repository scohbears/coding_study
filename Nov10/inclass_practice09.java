package Nov10;

public class inclass_practice09 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,6,5,3,2};
        int[] tempArr = new int[2];

        tempArr[0] = arr[0];
        tempArr[1] = arr[arr.length - 1];

        System.out.println(tempArr[0] + " " + tempArr[1]);
    }
}
