package July13_homework;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter noun to make it plural form : ");
        String input_string = input.nextLine();

        String plural_type = toPlural(input_string);
        System.out.print("Plural form of " + input_string + " is : ");
        System.out.println(plural_type);
    }
    //make noun to plural
    public static String toPlural(String input_string) {
        String plural = "";
        //get last character of data for "o","s","z","x"
        String lastone = Character.toString(input_string.charAt(input_string.length() - 1));
        //get last two character of data for "ch","sh"
        String lasttwo = input_string.substring(input_string.length() - 2, input_string.length());

        //check if last two or one character is "o","s","z","x","ch","sh" and add "es"
        //if last one is "y", then remove y and add "ies". // if last one or two is f or fe, then remove "f","fe" and add "ves"
        //if not add "s".
        if (lastone.equalsIgnoreCase("o")) {
            plural = input_string.concat("es");
        } else if (lastone.equalsIgnoreCase("s")) {
            plural = input_string.concat("es");
        } else if (lastone.equalsIgnoreCase("z")) {
            plural = input_string.concat("es");
        } else if (lastone.equalsIgnoreCase("x")) {
            plural = input_string.concat("es");
        } else if (lasttwo.equalsIgnoreCase("ch")) {
            plural = input_string.concat("es");
        } else if (lasttwo.equalsIgnoreCase("sh")) {
            plural = input_string.concat("es");
        } else if (lastone.equalsIgnoreCase("y")) {
            plural = input_string.substring(0,input_string.length()-1);
            plural = plural.concat("ies");
        } else if (lastone.equalsIgnoreCase("f")) {
            plural = input_string.substring(0,input_string.length()-1);
            plural = plural.concat("ves");
        } else if (lasttwo.equalsIgnoreCase("fe")) {
            plural = input_string.substring(0,input_string.length()-2);
            plural = plural.concat("ves");
        } else {
            plural = input_string.concat("s");
        }
        return plural;
    }
}
