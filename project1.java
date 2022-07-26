import java.math.MathContext;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        String[] a1 = new String[100];
        int[] b2 = new int[100];
        int res = 0;
        int count = 0;


//        Math math = new MathContext();
        String name;
        int answer;
        int right = 0;
        int wrong = 0;

        System.out.println("Math Game");
        while (true) {
            System.out.println("1-> Start game");
            System.out.println("2-> Rating ");
            System.out.println("3-> List of players ");
            System.out.print("= ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {

                    System.out.print("Name: ");
                    scanner = new Scanner(in);
                    name = scanner.next();
                    for (int i = 0; i < 3; i++) {
                        int a = random.nextInt(10);
                        int b = random.nextInt(10);
                        int c = random.nextInt(4);

                        scanner = new Scanner(in);

                        switch (c) {

                            case 0 -> {

                                res = a + b;

                                System.out.print(a + " +  " + b + " =  ");

                            }

                            case 1 -> {

                                res = a - b;

                                System.out.print(a + " -  " + b + " =  ");
                            }
                            case 2 -> {
                                res = a * b;
                                System.out.print(a + " *  " + b + " =  ");
                            }
                            case 3 -> {
                                res = a / b;
                                System.out.print(a + " /  " + b + " =  ");
                            }
                        }
                        answer = scanner.nextInt();

                        if (answer == res) {
                            right++;
                        } else {
                            wrong++;
                        }

                    }
                    a1[count] = name;
                    b2[count] = right;
                    count++;



                }
                case 2 -> {
                    for (int i = 0; i < count ; i++) {
                        System.out.println(a1[i]);
                        System.out.println(b2[i]);
                    }

                }


            }

        }




















    }
}
