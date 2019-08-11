package July31_homework;
import java.util.Scanner;

public class Homework_Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String sentence = input.nextLine();

        System.out.println("Count of space is : " + spaceCount(sentence));
    }
    public static int spaceCount(String sentence) {
        int count = 0;
        String[] splitedSentence = sentence.split(" ");
        for (int i = 0; i < splitedSentence.length; i++) {
            count++;
        }
        return count - 1;
    }
}
