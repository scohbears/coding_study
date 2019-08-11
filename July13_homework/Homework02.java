package July13_homework;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get string data from user
        System.out.print("Enter String data : ");
        String input_string = input.nextLine();

        System.out.println(printOddChar(input_string));
    }
    //print character in odd position of data.
    public static String printOddChar(String input_string) {
        String odd_char = "";
        //add character in odd position to odd_char
        for (int i = 1; i < input_string.length(); i = i + 2) {
            odd_char = odd_char.concat(Character.toString(input_string.charAt(i)));
        }
        return odd_char;
    }
}
