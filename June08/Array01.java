package June08;
//import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        int[] arr = {-1,3,-1,5};
        int num = arr.length;
        int sum = 0;
        int max = -1000000;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.println();
                System.out.print(j);
                sum = sum + arr[j];

                if (sum > max) {
                    max = sum;
                    System.out.println("Max" + max);
                }
                System.out.println(sum);
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Result is : " + max);
    }
}
