package July13_homework;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String data : ");
        String input_string = input.nextLine();

        int counted_vowel = countVowel(input_string);
        System.out.print("Count of vowel in " + input_string + " is : ");
        System.out.println(counted_vowel);
    }
    //return counted number of vowels in the data.
    public static int countVowel(String input_string) {
        int count = 0;
        //check every character of the data and if it is vowel add 1 on the count.
        for (int i = 0; i < input_string.length(); i++) {
            String char_to_string = Character.toString(input_string.charAt(i));
            if (char_to_string.equalsIgnoreCase("a")) {
                count++;
            } else if (char_to_string.equalsIgnoreCase("e")) {
                count++;
            } else if (char_to_string.equalsIgnoreCase("u")) {
                count++;
            } else if (char_to_string.equalsIgnoreCase("i")) {
                count++;
            } else if (char_to_string.equalsIgnoreCase("o")) {
                count++;
            }
        }
        return count;
    }
}
