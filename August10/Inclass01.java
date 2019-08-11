package August10;

public class Inclass01 {
    public static void main(String[] args) {
        int[][] data = {{1,2,3},{4,5,6}};

        for (int i = 0; i < data[0].length; i++) {
            int store = data[0][i];
            data[0][i] = data[1][i];
            data[1][i] = store;
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j]);
            }
        }
    }
}

