package July20_homework;
import java.util.Scanner;

public class Homework_Seyoung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        System.out.println(stringToNum(sentence));
    }

    public static String stringToNum(String sentence) {
        String numberedInput = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.toString(sentence.charAt(i)).equalsIgnoreCase("a")) {
                numberedInput = numberedInput.concat("0");
            } else if (Character.toString(sentence.charAt(i)).equalsIgnoreCase("e")) {
                numberedInput = numberedInput.concat("0");
            } else if (Character.toString(sentence.charAt(i)).equalsIgnoreCase("i")) {
                numberedInput = numberedInput.concat("0");
            } else if (Character.toString(sentence.charAt(i)).equalsIgnoreCase("o")) {
                numberedInput = numberedInput.concat("0");
            } else if (Character.toString(sentence.charAt(i)).equalsIgnoreCase("u")) {
                numberedInput = numberedInput.concat("0");
            } else if (Character.toString(sentence.charAt(i)).equals(" ")) {
                numberedInput = numberedInput.concat("9");
            } else {
                numberedInput = numberedInput.concat("1");
            }
        }
        return numberedInput;
    }
}
