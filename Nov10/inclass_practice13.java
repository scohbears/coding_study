package Nov10;

public class inclass_practice13 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,2,3};
         for (int i = 0; i < arr.length - 1; i++) {
             if (arr[i] == 2 && arr[i + 1] == 3) {
                 arr[i + 1] = 0;
             }
         }

         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
    }
}
