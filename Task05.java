package by.epam.unit03.main;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("> a: ");
        double a = sc.nextDouble();
        System.out.println("> b: ");
        double b = sc.nextDouble();
        System.out.println("> h: ");
        double h = sc.nextDouble();
        double f;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "f");
        System.out.println("-------------------------");

        for (double x = a; x <= b; x = x + h) {
            f = (2 * Math.tan(x / 2)) + 1;
            System.out.printf("|\t%4.2f\t|\t%4.2f\t|\n", x, f);
        }
        System.out.println("-------------------------");
    }
}
