package Virus;
import java.util.Scanner;

public class virus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] map = {{1,0,0,0,0,0,1,2},
                       {0,0,0,0,0,0,1,0},
                       {0,0,0,0,2,2,1,1},
                       {0,0,0,0,2,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {2,0,0,0,0,0,0,1}};
//        int[][] map = {{1,1,1,1,1,1,0,2},
//                {1,1,1,1,1,1,1,1},
//                {1,1,1,1,1,1,1,1},
//                {1,1,1,1,1,1,1,1},
//                {1,1,1,1,1,1,1,1},
//                {1,1,1,1,1,1,1,1},
//                {1,1,1,1,1,1,1,1},
//                {1,1,1,1,1,1,1,1}};
        print(map);

        while(!isGameOver(map)) {
            System.out.print("Which one are you going to select(1 or 2)? : ");
            int selection = input.nextInt();
            System.out.print("Enter x coordinate of selection : ");
            int xSelection = input.nextInt();
            System.out.print("Enter y coordinate of selection : ");
            int ySelection = input.nextInt();

            if (map[xSelection][ySelection] == selection) {
                System.out.print("Enter x coordinate to move : ");
                int xMove = input.nextInt();
                //Move and show according error
                //Make simple
                if (xMove-xSelection == 1 || xMove - xSelection == -1 || xMove - xSelection == 2
                        || xMove - xSelection == -2 || xMove-xSelection == 0) {
                    System.out.print("Enter y coordinate to move : ");
                    int yMove = input.nextInt();
                    if (yMove-ySelection == 1 || yMove - ySelection == -1 || yMove - ySelection == 2
                            || yMove - ySelection == -2 || yMove - ySelection == 0) {
                        if (xMove-xSelection == 0 && yMove - ySelection == 0) {
                            System.out.println("Error! Same place.");
                        }
                        if (xMove - xSelection == 2 || xMove - xSelection == -2) {
                            map[xSelection][ySelection] = 0;
                        }
                        if (yMove - ySelection == 2 || yMove - ySelection == -2) {
                            map[xSelection][ySelection] = 0;
                        }
                        if (map[xMove][yMove] == 0) {
                            map[xMove][yMove] = selection;
                        } else {
                            System.out.println("Error! That place is occupied.");
                        }
                        //infect
                        //add boundary
                        for (int i = -1; i <= 1; i++) {
                            for (int j = -1; j <= 1; j++) {
                                if(xMove + i != -1 && yMove + j != -1) {
                                    if (map[xMove + i][yMove + j] != selection && map[xMove + i][yMove + j] != 0) {
                                        map[xMove + i][yMove + j] = selection;
                                    }
                                }
                            }
                        }
                        print(map);
                    } else {
                        System.out.println("Error! Out of boundary.");
                    }
                } else {
                    System.out.println("Error! Out of boundary.");
                }
            } else {
                System.out.println("Error! You pick a wrong guy.");
            }
        }
    }

    public static boolean isGameOver (int[][] map) {
        boolean isOver = true;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    isOver = false;
                }
            }
        }
        return isOver;
    }

    public static void print(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
