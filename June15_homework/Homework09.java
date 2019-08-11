package June15_homework;

public class Homework09 {
    public static void main(String[] args) {
        int[] arr = {-1,3,-1000,100,-1,5};
        int temp_max = arr[0];
        int final_max = arr[0];

        int i = 1;
        while (i < arr.length) {
            if (arr[i] < temp_max + arr[i]) {
                temp_max = temp_max + arr[i];
            } else {
                temp_max = arr[i];
            }
            System.out.println("temp max : " + temp_max);
            if (temp_max > final_max) {
                final_max = temp_max;
            }
            i++;
            System.out.println("Maximum sum of continuous elements is : " + final_max);
        }
    }
}
