package Nov10;

public class inclass_practice12 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,5,2,3,9};
        int[] arrDoubleL = new int[arr.length * 2];

        for (int i = 0; i < arrDoubleL.length - 1; i++) {
            arrDoubleL[i] = 0;
        }
        arrDoubleL[arrDoubleL.length - 1] =  arr[arr.length - 1];

        for (int i = 0; i < arrDoubleL.length; i++) {
            System.out.print(arrDoubleL[i] + " ");
        }
    }
}
