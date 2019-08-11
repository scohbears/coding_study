package July20_homework;

import java.util.Scanner;

public class Homework_decrytion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get 3 lines separately
        System.out.println("Hello enter the encrypted message of Mr. Z and Mr. X");
        String firstLine = input.nextLine();
        String secondLine = input.nextLine();
        String thirdLine = input.nextLine();

        String decryptedMessage = decrypter(firstLine, secondLine, thirdLine);
        System.out.println("Secret message was about : " + decryptedMessage);
    }
    //get encrypted message and decrypt the message
    public static String decrypter(String firstLine, String secondLine, String thirdLine) {
        String decryptedMessage = "";
        //decrypt the message
        for (int i = 0; i < thirdLine.length(); i++) {
            //add jth character on the first line to the empty String if third's charater and second's character is same
            for (int j = 0; j < secondLine.length(); j++) {
                if (thirdLine.charAt(i) == secondLine.charAt(j)) {
                    decryptedMessage = decryptedMessage.concat(Character.toString(firstLine.charAt(j)));
                    //use break in case of multiple same character on second line.
                    break;
                } else if (secondLine.contains(Character.toString(thirdLine.charAt(i))) == false) {
                    decryptedMessage = decryptedMessage.concat(".");
                    break;
                }
            }
        }
        return decryptedMessage;
    }
}
