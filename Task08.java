package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

            double x;
            double y;
            String z;

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Введите операнд X > ");
                if (sc.hasNext("#")) {
                    System.out.println("Вычисление прекращено.");
                    break;
                }
                x = sc.nextDouble();

                System.out.print("Введите операнд Y > ");
                if (sc.hasNext("#")) {
                    System.out.println("Вычисление прекращено.");
                    break;
                }
                y = sc.nextDouble();

                System.out.print("Введите знак операции +, –, /, * > ");
                if (sc.hasNext("#")) {
                    System.out.println("Вычисление прекращено.");
                    break;
                }
                z = sc.next();

                switch (z) {
                    case "+":
                        System.out.println((x + y) + ". Что бы завершить программу введите #");
                        break;
                    case "-":
                        System.out.println((x - y) + ". Что бы завершить программу введите #");
                        break;
                    case "/":
                        if (y == 0) {
                            System.out.println("Данная операция невозможна. Что бы завершить программу введите #");
                            break;
                        }
                        System.out.println((x / y) + ". Что бы завершить программу введите #");
                        break;
                    case "*":
                        System.out.println((x * y) + ". Что бы завершить программу введите #");
                        break;
                    default:
                        System.out.println("Неверный знак операции. Что бы завершить программу введите #");
                        break;
                }
            }
        }//зачтено
    }
