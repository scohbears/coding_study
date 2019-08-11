package July31_homework;
import java.util.Scanner;

public class Homework_Insoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        System.out.println(reversingWords(sentence));
    }

    public static String reversingWords(String sentence) {
        String changedSentence = "";
        String[] splitedSentence = sentence.split(" ");

        for (int i = 0; i < splitedSentence.length; i++) {
            for (int j = splitedSentence[i].length() - 1; j >= 0; j--) {
                changedSentence = changedSentence.concat(Character.toString(splitedSentence[i].charAt(j)));
            }
            changedSentence = changedSentence.concat(" ");
        }
        return changedSentence.substring(0, changedSentence.length() - 1);
    }
}
