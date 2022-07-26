import java.util.Scanner;

import static java.lang.System.in;

public class exchangingcurrency {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        System.out.println("Please,Write your code for exchanging currency");
        int a= scanner.nextInt();
        if (a>1000000) {
            System.out.println(a + " enrolled for office");
            System.out.println("Select from selection bar");
            System.out.println("1->dollar to sum");
            System.out.println("2->Euro to sum");
            int b = scanner.nextInt();
            int sum = 0;
            switch (b) {
                case 1 -> {
                    System.out.println("enter your dollor");
                    int c = scanner.nextInt();

                    sum = c * 10972;
                    System.out.println(sum);
                    break;
                }
                case 2 -> {
                    System.out.println("enter your euro");
                    double d = scanner.nextDouble();
                    sum += d * 11204;
                    System.out.println(sum);
                }
            }
        }


















    }

}
