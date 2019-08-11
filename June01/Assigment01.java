package June01;
import java.util.Scanner;

public class Assigment01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double max_num = 0;
        double min_num = Double.POSITIVE_INFINITY;

        System.out.println("How many interger are you going to enter ? : ");
        int input_count = input.nextInt();

        for(int i = 1; i <= input_count; i++) {
            System.out.println("Enter interger number :");
            int input_num = input.nextInt();
            if(input_num > max_num) {
                max_num = input_num;
            } else if(input_num < min_num) {
                min_num = input_num;
            }
        }
        System.out.println("Biggest number among you entered is : " + max_num);
        System.out.println("Smallest number among you entered is : " + min_num);
    }
}
