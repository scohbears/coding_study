package July13_homework;
import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get data from user
        System.out.print("Enter multiple names (use , to distinguish name): ");
        String input_string = input.nextLine();

        String third_data = printThirdOne(input_string);
        System.out.println(third_data);
    }
    //return only third one of array
    public static String printThirdOne(String input_string) {
        String[] splited_string = input_string.split(",");
        String third_one = splited_string[2];
        return third_one;
    }
}
