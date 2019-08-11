package July13_homework;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String data : ");
        String input_string = input.nextLine();

        String string_without_lastone = printWithoutLastone(input_string);
        System.out.println(string_without_lastone);
    }
    //return without last character of the data
    public static String printWithoutLastone(String input_string) {
        String without_lastone = input_string.substring(0,input_string.length() - 1);
        return without_lastone;
    }
}
