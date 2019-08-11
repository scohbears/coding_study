package July20;
import java.util.Scanner;

public class Inclass02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plz enter a sentence : ");
        String sentence = input.nextLine();
        System.out.println(reverseOddWord(sentence));
    }

    public static String reverseOddWord(String sentence) {
        String[] splited_input = sentence.split(" ");
        String changed_input = "";
        for (int i = 0; i < splited_input.length; i++) {
            if (splited_input[i].length() % 2 == 0) {
                changed_input = changed_input.concat(splited_input[i] + " ");
            } else {
                String odd_word = splited_input[i];
                String reversed_word = "";
                for (int j = odd_word.length() - 1; j >= 0; j--) {
                    reversed_word = reversed_word.concat(Character.toString(odd_word.charAt(j)));
                }
                changed_input = changed_input.concat(reversed_word + " ");
            }
        }
        changed_input = changed_input.substring(0, changed_input.length() - 1);
        return changed_input;
    }
}
