package Nov10;

public class inclass_practice04 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,7,6,10,8,9};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
