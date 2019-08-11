package June08_homework;
//다시 temp_max = sum
public class Homework02 {
    public static void main(String[] args) {
        int[] arr = {-10000};
        int final_max = -100000;
        int temp_max = -100000;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum >= arr[i]) {
                temp_max = sum;
            } else {
                temp_max = arr[i];
                sum = arr[i];
            }
            if (final_max < temp_max) {
                final_max = temp_max;
            }
            System.out.println("Temp " + temp_max);
        }
        System.out.println("Max value is : " + final_max);
    }
}
