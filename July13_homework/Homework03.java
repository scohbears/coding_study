package July13_homework;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get first string data to compare
        System.out.print("Enter first string data to compare : ");
        String string_data1 = input.nextLine();
        //get second string data to compare
        System.out.print("Enter second string data to compare : ");
        String string_data2 = input.nextLine();

        System.out.print("Is two string data same ? ");
        System.out.println(compareString(string_data1, string_data2));
    }
    //return true if same, or not false
    public static boolean compareString(String string_data1, String string_data2) {
        boolean isSame = true;
        //compare if these are same
        if (string_data1.equalsIgnoreCase(string_data2)) {
            isSame = true;
        } else {
            isSame = false;
        }
        return isSame;
    }
}
