package June15_homework;

public class Homework08 {
    public static void main(String[] args) {
        int[] arr = {-1,3,-1,5};
        Integer max = Integer.MIN_VALUE;

        int i = 0;
        while (i < arr.length) {
            int sum = 0;
            int j = i;
            while (j < arr.length) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
                System.out.println("Sum : " + sum);
                System.out.println("Max update : " + max);
                j++;
            }
            i++;
        }
        System.out.println("Maximum sum of continuous elements is : " + max);
    }
}
//nogada