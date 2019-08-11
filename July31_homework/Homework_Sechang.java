package July31_homework;
import java.util.Scanner;

public class Homework_Sechang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a array which have a odd length : ");
        String array = input.nextLine();

        splitArray(array);
        //changeOrder(array);
    }

    public static void splitArray(String array) {
        String[] splitedArray = array.split(",");

        System.out.println(splitedArray[splitedArray.length / 2]);
        for (int i = 0; i < splitedArray.length / 2; i++) {
            System.out.println(splitedArray[i] + " , " + splitedArray[splitedArray.length - i - 1]);
        }
    }

    public static void changeOrder(String array) {
        String[] changedOrder = array.split(",");

        for (int i = 0; i < changedOrder.length / 4; i++) {
            String changer = changedOrder[i];
            changedOrder[i] = changedOrder[changedOrder.length / 2 - 1 - i];
            changedOrder[changedOrder.length / 2 - 1 - i] = changer;
        }

        System.out.println(changedOrder[0] + changedOrder[1] + changedOrder[2]);
        System.out.println(changedOrder[changedOrder.length / 2 + 1]);

        for (int i = changedOrder.length / 2 + 1; i <= changedOrder.length * 3 / 4; i++) {
            String changer = changedOrder[i];
            changedOrder[i] = changedOrder[changedOrder.length - i];
            changedOrder[changedOrder.length - i] = changer;
        }
        System.out.println(changedOrder[4] + changedOrder[5] + changedOrder[6]);
    }
}
