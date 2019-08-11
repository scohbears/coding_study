package July20_homework;
import java.util.Scanner;

public class Homework_Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two sentences to combine (It supposed not to be word): ");
        String firstLine = input.nextLine();
        String secondLine = input.nextLine();

        if (firstLine.contains(" ") == false || secondLine.contains(" ") == false) {
            System.out.println("Error! It is not a sentence!");
        } else {
            System.out.println(combineTwoSentences(firstLine, secondLine));
        }
    }

    public static String combineTwoSentences(String firstLine, String secondLine) {
        String[] splitedFirst = firstLine.split(" ");
        String[] splitedSecond = secondLine.split(" ");
        String combinedSentence = "";
        int longerLength;
        int shorterLength;

        if (splitedFirst.length > splitedSecond.length) {
            longerLength = splitedFirst.length;
            shorterLength = splitedSecond.length;
        } else {
            longerLength = splitedSecond.length;
            shorterLength = splitedFirst.length;
        }

        for (int i = 0; i < shorterLength; i = i + 2) {
            combinedSentence = combinedSentence.concat(splitedFirst[i] + " ");
            combinedSentence = combinedSentence.concat(splitedSecond[i + 1] + " ");
        }
        if (splitedFirst.length > splitedSecond.length) {
            for (int i = shorterLength; i < longerLength; i++) {
                combinedSentence = combinedSentence.concat(splitedFirst[i] + " ");
            }
        } else {
            for (int i = shorterLength; i < longerLength; i++) {
                combinedSentence = combinedSentence.concat(splitedSecond[i] + " ");
            }
        }
        return combinedSentence.substring(0,combinedSentence.length() - 1);
    }
}
