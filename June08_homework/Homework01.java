package June08_homework;

public class Homework01 {
    public static void main(String[] args) {
        int[] arr = {-1,3,-1,5};
        int num = arr.length;
        int sum = 0;
        int max = -1000000;

        for (int i = 0; i < arr.length; i ++) {
            System.out.print(i);
            System.out.println();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(i);
            System.out.print(i+1);
            System.out.println();
        }

        for (int i = 0; i < arr.length - 2; i++) {
            System.out.print(i);
            System.out.print(i + 1);
            System.out.print(i + 2);
            System.out.println();
        }

        for (int i = 0; i < arr.length - 3; i++) {
            System.out.print(i);
            System.out.print(i + 1);
            System.out.print(i + 2);
            System.out.print(i + 3);
            System.out.println();
        }
        System.out.println("Result is : " + max);
    }

}
