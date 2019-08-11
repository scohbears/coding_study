package July13_homework;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        String changed_sentence = changeWordOrder(sentence);
        System.out.print("Changed sentence is : ");
        System.out.println(changed_sentence);
    }
    //return changed order of sentence in reverse order
    public static String changeWordOrder(String sentence) {
        String order_changer  = "";
        //split words and make it array
        String[] arr = sentence.split(" ");
        //and store in order_changer in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            order_changer = order_changer.concat(arr[i]);
            order_changer = order_changer.concat(" ");
        }
        return order_changer;
    }
}
