package Nov01_homework;
import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array : ");
        int arrSize = input.nextInt();

        String[] arrName = new String[arrSize];
        int[] arrScore = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter name : ");
            String name = input.next();
            arrName[i] = name;

            System.out.print("Enter score : ");
            int score = input.nextInt();
            arrScore[i] = score;
        }
        printArr(arrName, arrScore);

        sort(arrName, arrScore);
        printArr(arrName,arrScore);
        System.out.println("Highest score : " + arrName[arrSize - 1] + " : " + arrScore[arrSize - 1]);
        System.out.println("Lowest score : " + arrName[0] + " : " + arrScore[0]);
    }

    public static void printArr(String[] arrName, int[] arrScore) {
        for (int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i] + " : " + arrScore[i]);
        }
        System.out.println();
    }

    public static void sort(String[] arrName, int[] arrScore) {
        for (int i = arrScore.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arrScore[j] > arrScore[j + 1]) {
                    int tempS = arrScore[j];
                    arrScore[j] = arrScore[j + 1];
                    arrScore[j + 1] = tempS;

                    String tempN = arrName[j];
                    arrName[j] = arrName[j + 1];
                    arrName[j + 1] = tempN;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
