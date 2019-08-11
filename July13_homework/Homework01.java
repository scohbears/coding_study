package July13_homework;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get a data from user
        System.out.print("Enter String data to input : ");
        String input_string = input.nextLine();

        String half_and_switch = cutHalfSwitch(input_string);
        System.out.println(half_and_switch);
    }
    //Switch position of first half of string and second half of string.
    public static String cutHalfSwitch(String input_string) {
        String switch_data = "";
        //add 2nd half of data to switch_data
        for (int i = (input_string.length() / 2); i <= input_string.length() - 1; i++) {
            //use Character.toString to change char to string.
            switch_data = switch_data.concat(Character.toString(input_string.charAt(i)));
        }
        //add 1st half of data to switch_data
        for (int i = 0; i <= (input_string.length() / 2) - 1; i++) {
            switch_data = switch_data.concat(Character.toString(input_string.charAt(i)));
        }
        return switch_data;
    }
}
