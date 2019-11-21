package Nov10;

public class inclass_practice11 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,3};

        boolean isOneTwo = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 || arr[i] == 2) {
                isOneTwo = false;
            }
        }
        System.out.println(isOneTwo);
    }
}
