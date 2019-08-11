package July31_homework;
import java.util.Scanner;

public class CellPhone_Messaging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter seven words");
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter a word: ");
            String word = input.nextLine();
            if (word.equalsIgnoreCase("halt")) {
                System.out.println();
            } else  {
                System.out.println(numToPress(word));
            }
        }
    }

    public static int numToPress(String word) {
        String pressTwo = "abc";
        String pressThree = "def";
        String pressFour = "ghi";
        String pressFive = "jkl";
        String pressSix = "mno";
        String pressSeven = "pqrs";
        String pressEight = "tuv";
        String pressNine = "wxyz";

        String oneTime = "adgjmptw";
        String twoTimes = "behknqux";
        String threeTimes = "cfilorvy";
        String fourTimes = "sz";

        int count = 0;
        String addTwoSecond = "";

        for (int i = 0; i < word.length(); i++) {
            if(oneTime.contains(Character.toString(word.charAt(i)))) {
                count++;
            } else if (twoTimes.contains(Character.toString(word.charAt(i)))) {
                count = count + 2;
            } else if (threeTimes.contains(Character.toString(word.charAt(i)))) {
                count = count + 3;
            } else {
                count = count +4;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (pressTwo.contains(Character.toString(word.charAt(i)))) {
                addTwoSecond = addTwoSecond.concat("2");
            } else if (pressThree.contains(Character.toString(word.charAt(i)))) {
                addTwoSecond = addTwoSecond.concat("3");
            } else if (pressFour.contains(Character.toString(word.charAt(i)))) {
                addTwoSecond = addTwoSecond.concat("4");
            } else if (pressFive.contains(Character.toString(word.charAt(i)))) {
                addTwoSecond = addTwoSecond.concat("5");
            } else if (pressSix.contains(Character.toString(word.charAt(i)))) {
                addTwoSecond = addTwoSecond.concat("6");
            } else if (pressSeven.contains(Character.toString(word.charAt(i)))) {
                addTwoSecond = addTwoSecond.concat("7");
            } else if (pressEight.contains(Character.toString(word.charAt(i)))) {
                addTwoSecond = addTwoSecond.concat("8");
            } else {
                addTwoSecond = addTwoSecond.concat("9");
            }
        }
        for (int i = 0; i < addTwoSecond.length() - 1; i++) {
            if (addTwoSecond.charAt(i) == addTwoSecond.charAt(i + 1)) {
                count = count + 2;
            }
        }
        return count;
    }
}
