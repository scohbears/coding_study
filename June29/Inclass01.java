package June29;
import java.util.Scanner;

public class Inclass01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello " + printName());
        showMenu();

        while (true) {
            System.out.println();
            System.out.print("Enter integer number 0 ~ 6 or 999 to exit : ");
            int input_num = input.nextInt();

            if (input_num == 999) {
                System.out.println("Bye Bye " + printName());
                break;
            } else {
                execute(input_num);
            }
        }
    }

    public static String printName() {
        return "Sechang";
    }

    public static void showMenu() {
        System.out.println("0) Show menu");
        System.out.println("1) Show 1 ~ n left side half diamond");
        System.out.println("2) Show reverse 1 ~ n  right side half diamond");
        System.out.println("3) Show star triangle");
        System.out.println("4) Show 4 ~ 1 left side half diamond frame");
        System.out.println("5) Show weird star ribbon");
        System.out.println("6) Show star diamond");
        System.out.println("999) Exit Program");
    }

    public static void print01(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }

        int a = n;
        while (a > 1) {
            int b = 1;
            while (b < a) {
                System.out.print(b);
                b++;
            }
            a--;
            System.out.println();
        }
    }

    public static void print02(int n) {
        int k = 0;
        while (k < n) {
            int i = n - 1;
            while (i > k) {
                System.out.print (" ");
                i--;
            }
            int j = k + 1;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            k++;
            System.out.println();
        }

        int a = 0;
        int num = n;
        while (a < n - 1) {
            int b = 0;
            while(b <= a) {
                System.out.print(" ");
                b++;
            }
            int c = num - 1;
            while (c > 0) {
                System.out.print(c);
                c--;
            }
            a++;
            num--;
            System.out.println();
        }
    }

    public static void print03(int n) {
        int i = 0;
        while (i < n) {
            int j = n - 1;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            int k = 0;
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
    }

    public static void print04(int n) {
        int i = n;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i--;
        }

        int a = 2;
        while (a <= n) {
            int b = a;
            while (b > 0) {
                System.out.print(b);
                b--;
            }
            System.out.println();
            a++;
        }
    }

    public static void print05(int n) {
        int i = 0;
        while (i < n) {
            int j =  0;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            int k = n;
            while (k > i) {
                System.out.print("*");
                k--;
            }
            System.out.println();
            i++;
        }

        int a = 0;
        while (a < n) {
            int b = 0;
            while (b < n) {
                System.out.print(" ");
                b++;
            }
            int y = 0;
            while (y <= a) {
                System.out.print("*");
                y++;
            }
            System.out.println();
            a++;
        }
    }

    public static void print06(int n) {
        int i = 0;
        while (i < n) {
            int j = n - 1;
            while (j > i) {
                System.out.print(" ");
                j--;
            }

            int k = 0;
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }

        int a  = n;
        while (a > 1) {
            int b = n;
            while (b >= a) {
                System.out.print(" ");
                b--;
            }

            int c = 2 * (a - 1) - 1;
            while (c > 0) {
                System.out.print("*");
                c--;
            }
            System.out.println();
            a--;
        }
    }

    public static void execute(int n) {
        Scanner in = new Scanner(System.in);
        if (n >= 0 && n <= 6) {
            if (n == 0) {
                System.out.println();
                System.out.println("...Showing Menu...");
                showMenu();
            } else if (n == 1) {
                System.out.println();
                System.out.println("...Showing 1 ~ n left side half diamond...");
                System.out.print("Enter positive integer number : ");
                int in_num = in.nextInt();

                if (in_num <= 0) {
                    System.out.println("Error! Not a positive integer number!");
                } else {
                    print01(in_num);
                }
            } else if (n == 2) {
                System.out.println();
                System.out.println("...Showing reverse 1 ~ n  right side half diamond...");
                System.out.print("Enter positive integer number : ");
                int in_num = in.nextInt();

                if (in_num <= 0) {
                    System.out.println("Error! Not a positive integer number!");
                } else {
                    print02(in_num);
                }
            } else if (n == 3) {
                System.out.println();
                System.out.println("...Showing star triangle...");
                System.out.print("Enter positive integer number : ");
                int in_num = in.nextInt();

                if (in_num <= 0) {
                    System.out.println("Error! Not a positive integer number!");
                } else {
                    print03(in_num);
                }
            } else if (n == 4) {
                System.out.println();
                System.out.println("...Showing 4 ~ 1 left side half diamond frame...");
                System.out.print("Enter positive integer number : ");
                int in_num = in.nextInt();

                if (in_num <= 0) {
                    System.out.println("Error! Not a positive integer number!");
                } else {
                    print04(in_num);
                }
            } else if (n == 5) {
                System.out.println();
                System.out.println("...Show weird star ribbon...");
                System.out.print("Enter positive integer number : ");
                int in_num = in.nextInt();

                if (in_num <= 0) {
                    System.out.println("Error! Not a positive integer number!");
                } else {
                    print05(in_num);
                }
            } else if (n == 6) {
                System.out.println();
                System.out.println("...Showing star diamond...");
                System.out.print("Enter positive integer number : ");
                int in_num = in.nextInt();

                if (in_num <= 0) {
                    System.out.println("Error! Not a positive integer number!");
                } else {
                    print06(in_num);
                }
            }
        } else {
            System.out.println("Error! You should enter integer number 0 ~ 6 or 999 to exit!");
        }
    }
}
