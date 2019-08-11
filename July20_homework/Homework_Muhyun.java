package July20_homework;
import java.util.Scanner;

public class Homework_Muhyun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius : ");
        double celsius = input.nextDouble();

        System.out.println(celsius + " Celsius degree is " + CtoF(celsius) + " Fahrenheit degree");
    }

    public static double CtoF(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}
