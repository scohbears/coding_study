package June01_homework;
import java.util.Scanner;

public class June08Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive integer number : ");
        int input_num = input.nextInt();

        if(input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            for (int i = 1; i <= input_num; i++) {
                for (int j = 1; j <= i; j++) {
                    for (int k = 1; k <= j; k++) {
                        System.out.print(k);
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }
}
