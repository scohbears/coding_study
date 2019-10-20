package Virus;
import java.util.Scanner;

public class virus_revised {
    public static void main(String[] args) {
        int[][] map = getMap();
        printMap(map);
        int selection = 1;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println(selection + "'s turn!");

            // Get source coordinates of the cell I want to move.
            System.out.print("Choose Y on the  map: ");
            int inputY = s.nextInt();
            System.out.print("Choose X on the map: ");
            int inputX = s.nextInt();
            // Cell must be owned by either player1 or player2.
            if (map[inputY][inputX] != 1 && map[inputY][inputX] != 2) {
                System.out.println("Pick a valid cell!");
                continue;
            }
            // Input cell should be equal to selection
            if (map[inputY][inputX] != selection) {
                System.out.println("You pick a wrong cell!");
                continue;
            }

            map = addFive(map, inputX, inputY);
            printMap(map);

            // Get destination coordinates of the cell I want to move to.
            System.out.print("input Y which you want to move: ");
            int outputY = s.nextInt();
            System.out.print("input X which you want to move: ");
            int outputX = s.nextInt();
            // Cannot move to a cell that is occupied.
            if (map[outputY][outputX] == 1 || map[outputY][outputX] == 2) {
                System.out.println("Invalid location!");
                continue;
            }

            // Get the distance a cell is moving.
            int diff = getCellDiff(inputX, inputY, outputX, outputY);
            if (diff == 1) {
                map[outputY][outputX] = map[inputY][inputX];
            } else if (diff == 2) {
                map[outputY][outputX] = map[inputY][inputX];
                map[inputY][inputX] = 0;
            } else {
                System.out.println("You tried to move too much!");
                continue;
            }
            //erase 5
            map = eraseFive(map);

            // Infect surrounding cells after moving to the destination coordinates.
            map = infect(map, outputX, outputY);

            //change turn
            selection = (selection % 2) + 1;
            // show score
            displayScore(map);

            //Gameover
            printMap(map);
            if (gameOverCase01(map, selection)) {
                System.out.println("Gameover!");
                System.out.println("If you want to restart press '0': ");
                int restart = s.nextInt();
                if (restart == 0) {
                    System.out.println("New game start!");
                    map = getMap();
                    printMap(map);
                    selection = 1;
                    continue;
                } else {
                    break;
                }
            }
        }
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] getMap() {
        int[][] map = {
                {2, 2, 2, 0, 0, 0, 0, 0},
                {2, 2, 2, 0, 0, 0, 0, 0},
                {2, 2, 2, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 1, 0, 0, 0}};
        return map;
    }

    public static int getCellDiff(int inputX, int inputY, int outputX, int outputY) {
        int diff;
        int diffX = inputX - outputX;
        int diffY = inputY - outputY;
        if (diffX < 0) {
            diffX = diffX * -1;
        }
        if (diffY < 0) {
            diffY = diffY * -1;
        }

        if (diffX < diffY) {
            diff = diffY;
        } else {
            diff = diffX;
        }
        return diff;
    }

    public static int[][] addFive (int[][] map, int inputX, int inputY) {
        for (int i = inputX - 2; i <= inputX + 2; i++) {
            for (int j = inputY - 2; j <= inputY + 2; j++) {
                if (i >= 0 && j >= 0 && i < map.length && j < map.length && map[j][i] == 0) {
                    map[j][i] = 5;
                }
            }
        }
        return map;
    }

    public static int[][] eraseFive (int[][] map) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j ++) {
                if (map[i][j] == 5) {
                    map[i][j] = 0;
                }
            }
        }
        return map;
    }

    public static int[][] infect (int[][] map, int outputX, int outputY) {
        for (int i = outputX - 1; i <= outputX + 1; i++) {
            for (int j = outputY - 1; j <= outputY + 1; j++) {
                if (i >= 0 && j >= 0 && i < map.length && j < map.length && map[j][i] != 0) {
                    map[j][i] = map[outputY][outputX];
                }
            }
        }
        return map;
    }

    public static void displayScore (int[][] map) {
        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j ++) {
                if (map[i][j] == 1) {
                    countOne++;
                }
                if (map[i][j] == 2) {
                    countTwo++;
                }
            }
        }
        System.out.println("Score 1 vs 2 = " + countOne + " : " + countTwo);
    }
    // When there is no cell to move
    public static boolean gameOverCase01 (int[][] map, int selection) {
        boolean case01 = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (map[i][j] == selection) {
                    for (int a = i - 2; a <= i + 2; a++) {
                        for (int b = j - 2; b <= j + 2; b++) {
                            if (a >= 0 && b >= 0 && a < map.length && b < map.length && map[a][b] == 0) {
                                case01 = false;
                            }
                        }
                    }
                }
            }
        }
        return case01;
    }
    // When there is no 1 or 2
    public static boolean gameOverCase02 (int[][] map, int selection) {
        boolean case02 = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (map[i][j] == selection) {
                    case02 = false;
                }
            }
        }
        return case02;
    }
}
