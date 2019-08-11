package July31_homework;
import java.util.Scanner;

public class Homework_Seyoung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word : ");
        String word = input.nextLine();
        count(word);
    }

    public static void count(String word) {
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                vCount++;
            } else if (word.charAt(i) == 'e') {
                vCount++;
            } else if (word.charAt(i) == 'i') {
                vCount++;
            } else if (word.charAt(i) == 'o') {
                vCount++;
            } else if (word.charAt(i) == 'u') {
                vCount++;
            } else {
                cCount++;
            }
        }
        System.out.println("Vowel count is : " + vCount);
        System.out.println("Consonant count is : " + cCount);
    }
}
