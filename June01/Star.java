package June01;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive number to get a half tree made of star : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number!");
        } else {
            for (int i = 1; i <= input_num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
