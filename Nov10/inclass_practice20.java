package Nov10;

public class inclass_practice20 {
    public static void main(String[] args) {
        int[] arr = {2,5,9};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
