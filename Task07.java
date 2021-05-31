package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите римскую цифру >");
        String roman = sc.nextLine();

        int x = 0;
        switch (roman) {
            case "I":
                x = 1;
                break;
            case "V":
                x = 5;
                break;
            case "X":
                x = 10;
                break;
            case "L":
                x = 50;
                break;
            case "C":
                x = 100;
                break;
            case "D":
                x = 500;
                break;
            case "M":
                x = 1000;
                break;
            default:
                System.out.println("Неправильная цифра");
                return;
        }
        System.out.println("Римская цифра " + roman + " равна " + x);
    }
}
