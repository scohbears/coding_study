package June29_homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello " + printName());
        showMenu();

        while (true) {
            System.out.println();
            System.out.print("Enter integer number 0 ~ 11 or 999 to exit : ");
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
        System.out.println("7) Show maximum and minimum value among what user input");
        System.out.println("8) Show maximum sum of continuous elements of array considering every cases");
        System.out.println("9) Show maximum sum of continuous elements of array using simple method");
        System.out.println("10) Get array elements from user and find if there is element what user want to find");
        System.out.println("11) Get sum before a number which user put in, if user enter number < 0 program ends");
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
    //Error
    public static void print07(int n) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 0;

        int i = 0;
        while (i < n) {
            System.out.print("Enter integer number to put in : ");
            int input_data = input.nextInt();
            if (i == 0) {
                min = input_data;
                max = input_data;
            }
            if (input_data < min) {
                min = input_data;
            } else if (input_data > max) {
                max = input_data;
            }
            i++;
        }
        System.out.println("Minimum value is : " + min);
        System.out.println("Maximum value is : " + max);
    }
    //Error
    public static void print08() {
        int[] arr = {-1,3,-1,5};
        Integer max = arr[0];

        int i = 0;
        while (i < arr.length) {
            int sum = 0;
            int j = i;
            while (j < arr.length) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
                System.out.println("Sum : " + sum);
                System.out.println("Max update : " + max);
                j++;
            }
            i++;
        }
        System.out.println("Maximum sum of continuous elements is : " + max);
    }

    public static void print09() {
        int[] arr = {-1,3,-1000,100,-1,5};
        int temp_max = arr[0];
        int final_max = arr[0];

        int i = 1;
        while (i < arr.length) {
            if (arr[i] < temp_max + arr[i]) {
                temp_max = temp_max + arr[i];
            } else {
                temp_max = arr[i];
            }
            System.out.println("temp max : " + temp_max);
            if (temp_max > final_max) {
                final_max = temp_max;
            }
            i++;
            System.out.println("Maximum sum of continuous elements is : " + final_max);
        }
    }

    public static void print10() {
        Scanner input = new Scanner(System.in);

        System.out.print("How many element are you going to put in ? Enter number : ");
        int input_num = input.nextInt();

        int[] arr = new int[input_num];

        if (input_num <= 0) {
            System.out.println("Error! Please enter positive integer number !");
        } else {
            int i = 0;
            while (i < arr.length) {
                System.out.print("Enter integer number for element arr[" + i + "] : ");
                int input_element = input.nextInt();
                arr[i] = input_element;
                i++;
            }

            System.out.print("Enter how many are you going to enter to find a element : ");
            int input_finder = input.nextInt();


            if (input_finder <= 0) {
                System.out.println("Error! Please enter positive integer number !");
            } else {
                int j = 0;
                while (j < input_finder) {
                    boolean finded = false;
                    System.out.print("Enter element to find : ");
                    int finder = input.nextInt();

                    int k = 0;
                    while (k < arr.length) {
                        if (finder == arr[k]) {
                            finded = true;
                        }
                        k++;
                    }
                    j++;
                    if(finded) {
                        System.out.println("Found!");
                    } else {
                        System.out.println("Not Found!");
                    }
                }

            }
        }
    }

    public static void print11() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter positive integer number : ");
            int input_num = input.nextInt();

            if (input_num <= 0) {
                System.out.println("Error! Please enter positive integer number!");
                break;
            } else {
                int sum = 0;
                int i = input_num;
                while (i > 0) {
                    sum = sum + i;
                    i--;
                }
                System.out.println("Sum from " + input_num + " to 1 is : " + sum);
            }
        }
    }

    public static void execute(int n) {
        Scanner in = new Scanner(System.in);
        if (n >= 0 && n <= 11) {
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
            } else if (n == 7) {
                System.out.println();
                System.out.println("...Showing maximum and minimum value among what user input...");
                System.out.print("Enter positive integer number : ");
                int in_num = in.nextInt();

                if (in_num <= 0) {
                    System.out.println("Error! Not a positive integer number!");
                } else {
                    print07(in_num);
                }
            } else if (n == 8) {
                System.out.println();
                System.out.println("...Showing maximum sum of continuous elements of array considering every cases...");
                print08();
            } else if (n == 9) {
                System.out.println();
                System.out.println("...Show maximum sum of continous elements of array using simple method...");
                print09();
            } else if (n == 10) {
                System.out.println();
                System.out.println("...Get array elements from user and find if there is element what user want to find...");
                print10();
            } else if (n == 11) {
                System.out.println();
                System.out.println("...Get sum before a number which user put in, if user enter number < 0 program ends...");
                print11();
            }
        } else {
            System.out.println("Error! You should enter integer number 0 ~ 6 or 999 to exit!");
        }
    }
}
