package July13_homework;
import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String data : ");
        String input_string = input.nextLine();
        int string_length = input_string.length();
        //check if length of data is even
        if (string_length % 2 == 0) {
            String added_andsign = addAndsign(input_string);
            System.out.println(added_andsign);
        } else {
            System.out.println("Error! Even length only!");
        }
    }
    //return data with " & " in the middle of data
    public static String addAndsign (String input_string) {
        String andsign_added = "";
        //add first half
        for (int i = 0; i < input_string.length() / 2; i++) {
            andsign_added = andsign_added.concat(Character.toString(input_string.charAt(i)));
        }
        //and add " & "
        andsign_added = andsign_added.concat(" & ");
        //and add second half
        for (int i = input_string.length() / 2; i <= input_string.length() - 1; i++) {
            andsign_added = andsign_added.concat(Character.toString(input_string.charAt(i)));
        }
        return andsign_added;
    }
}
