package June01_homework;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter positive integer : ");
        int input_num = input.nextInt();

        if (input_num <= 0) {
            System.out.print("Error! Please enter positive integer ! ");

        } else {
            //int num = input_num;

            for (int a = input_num; a > 0; a--) {
                for (int i = a; i > 0; i--) {
                    for(int j = 1; j <= i; j++) {
                        System.out.print(2 * j - 1);
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
