package July31_homework;
import java.util.Scanner;

public class Muhyun_by_Alice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("put a five digit or alphabet : ");
        String input = s.nextLine();

        String [] Arry = {"0123456789"};

        boolean isTrue = false;
        for (int i = 0; i < input.length() ; i++) {
            isTrue = false;
            for (int j = 0; j < Arry[0].length(); j++) {
                if (input.charAt(i) == Arry[0].charAt(j)) {
                    isTrue = true;
                    break;
                }
            }
            if (isTrue == false) {
                System.out.println("false");
                break;
            }
        }
        if (isTrue) {
            System.out.println("true");
        }
    }
}

