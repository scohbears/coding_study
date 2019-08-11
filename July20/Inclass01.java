package July20;
import java.util.Scanner;

public class Inclass01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String sentence = sc.nextLine();
        System.out.println(reversedSentence(sentence));
    }
    public static String reversedSentence(String sentence) {
        String[] splited_input = sentence.split(" ");

        if (splited_input.length % 2 == 0) {
            for (int i = 0; i < splited_input.length; i = i + 2) {
                String copied_input = splited_input[i];
                splited_input[i] = splited_input[i + 1];
                splited_input[i + 1] = copied_input;
            }

            String reordered_input = "";
            for (int i = 0; i < splited_input.length; i++) {
                reordered_input = reordered_input.concat(splited_input[i] + " ");
            }
            return reordered_input;
        } else {
            String reordered_input = "";

            for (int i = splited_input.length / 2 + 1; i < splited_input.length; i++) {
                reordered_input = reordered_input.concat(splited_input[i] + " ");
            }

            reordered_input = reordered_input.concat(splited_input[splited_input.length / 2] + " ");

            for (int i = 0; i < splited_input.length / 2 - 1; i++) {
                reordered_input = reordered_input.concat(splited_input[i] + " ");
            }

            reordered_input = reordered_input.concat(splited_input[splited_input.length / 2 - 1]);

            return reordered_input;
        }
    }
}
