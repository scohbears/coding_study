package July13_homework;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter verb to make it past form : ");
        String input_string = input.nextLine();

        String past_type = toPast(input_string);
        System.out.print("Past tense of " + input_string + " is : ");
        System.out.println(past_type);
    }
    //return data add "ed"
    public static String toPast(String input_string) {
        String past = "";
        past = input_string.concat("ed");
        return past;
    }
}

