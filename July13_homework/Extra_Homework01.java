package July13_homework;
import java.util.Scanner;

public class Extra_Homework01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello enter the encrypted message of Mr. Z and Mr. X");
        String firstLine = input.nextLine();
        String secondLine = input.nextLine();
        String thirdLine = input.nextLine();

        String decryptedMessage = decrypter(firstLine, secondLine, thirdLine);
        String decryptedMessageFinal = addDot(secondLine,decryptedMessage);
        System.out.println(decryptedMessageFinal);
    }

    public static String decrypter(String firstLine, String secondLine, String thirdLine) {
        String decryptedMessage = "";
        return decryptedMessage;
    }

    public static String addDot(String secondLine, String decryptedMessage) {
        boolean isNotSame = true;

        for (int i = 0; i < secondLine.length(); i++) {
            for (int j = 0; j < decryptedMessage.length(); j++) {
                if (Character.toString(secondLine.charAt(i)).equals(Character.toString(decryptedMessage.charAt(j)))) {
                    isNotSame = false;
                }
            }
            if (isNotSame) {
                decryptedMessage = decryptedMessage.replace(decryptedMessage.charAt(i),'.');
            }
        }
        return decryptedMessage;
    }
}
