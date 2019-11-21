package Nov10;

public class inclass_practice22 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,1,4};
        int[] arr2 = {2,1,3};
        int[] newArr = new int[2];

        newArr[0] = arr1.length;
        newArr[1] = arr2.length;

        System.out.println(newArr[0] + " " + newArr[1]);
    }
}
