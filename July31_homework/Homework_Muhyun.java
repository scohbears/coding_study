package July31_homework;
import java.util.Scanner;

public class Homework_Muhyun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter : ");
            array[i] = input.nextLine();
        }
        System.out.println(thereIsLetter(array));
    }

    public static boolean thereIsLetter(String[] array) {
        String letter = "0123456789";
        boolean isLetter = false;

        for (int i = 0; i < array.length; i++) {
            isLetter = false;
            for (int j = 0; j < letter.length(); j++) {
                if (array[i].equals(Character.toString(letter.charAt(j)))) {
                    isLetter = false;
                }
            }
        }
        return isLetter;
    }
}
