package July13_homework;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();
        int word_counted = wordCount(sentence);
        System.out.print("Total word in this sentence is : ");
        System.out.println(word_counted);
    }
    //return the count of word.
    public static int wordCount(String sentence) {
        int count = 0;
        //split words and make it array and count the number of array.
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
}
