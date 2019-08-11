package July13;
import java.util.Scanner;

public class Inclass01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input_string = input.nextLine();

        System.out.println("This is original string");
        System.out.println(input_string);

        System.out.println();
        System.out.println("This is reversed string");
        System.out.println(reverse(input_string));
    }

    public static String reverse (String input_string) {
        String reversed_input = "";

        for (int i = input_string.length() - 1; i >= 0; i--) {
            reversed_input = reversed_input.concat(Character.toString(input_string.charAt(i)));
        }
        return reversed_input;
    }
}
