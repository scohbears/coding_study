package Nov10;

public class inclass_practice14 {
    public static void main(String[] args) {
        int[] arr1 = {2,1,3,4,2,2};
        int[] arr2 = {4,4,4,4,5,3,1};

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 1) {
                count++;
                break;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == 1) {
                count++;
                break;
            }
        }

        System.out.println(count);
    }
}
