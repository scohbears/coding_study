package Nov01_homework;

public class homework05 {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "banana", "banana", "apple", "cat"};
        sort(arr);
        printArr(arr);
        finder(arr);

    }
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minValue]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[minValue];
                    arr[minValue] = temp;
                }
            }
        }
    }

    public static void finder (String[] arr) {
        String biggestWordCount = "";
        int maxCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            if (arr[i].equalsIgnoreCase(arr[i + 1])) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j].equalsIgnoreCase(arr[i])) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (maxCount < count) {
                    maxCount = count;
                    biggestWordCount = arr[i];
                } else if (maxCount == count) {
                    biggestWordCount = biggestWordCount + " " + arr[i];
                }
                System.out.println("final count : " + count);
                System.out.println("Max count : " + maxCount);
                System.out.println("Word : " + biggestWordCount);
            }
            i = i + count - 1;
        }
        System.out.println(biggestWordCount);
    }
}
