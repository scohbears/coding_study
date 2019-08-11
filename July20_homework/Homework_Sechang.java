package July20_homework;
import java.util.Scanner;

public class Homework_Sechang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = input.nextLine();

        System.out.println("Output : " + reverseEvenOne(word));
    }
    //return after reversing the order of even position
    public static String reverseEvenOne(String word) {
        String changedWord = "";
        int lengthEven = word.length() - 2;
        int lengthOdd = word.length() - 1;

        for (int i = 1; i < word.length(); i = i + 2) {
            if (word.length() % 2 == 0) {
                if (lengthEven >= 0) {
                    changedWord = changedWord.concat(Character.toString(word.charAt(lengthEven)));
                    changedWord = changedWord.concat(Character.toString(word.charAt(i)));
                    lengthEven = lengthEven - 2;
                }
            } else {
                if (lengthOdd >= 0) {
                    changedWord = changedWord.concat(Character.toString(word.charAt(lengthOdd)));
                    changedWord = changedWord.concat(Character.toString(word.charAt(i)));
                    lengthOdd = lengthOdd - 2;
                }
            }
        }
        if (word.length() % 2 == 0) {
            return changedWord;
        } else {
            return changedWord.concat(Character.toString(word.charAt(0)));
        }
    }
}
