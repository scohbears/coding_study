package June01;

public class gugudanTest {
    public static void main(String[] args) {
        int g = 9;

        for (int i = 2; i <= g; i++) {
            for (int j = 1; j <= g; j++) {
                int gugu_value = i * j;
                System.out.println(i + " x " + j + " = " + gugu_value);
            }
        }
        System.out.println("DONE!");
    }
}
