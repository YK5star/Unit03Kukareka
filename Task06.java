package by.epam.unit03.main;

public class Task06 {

    public static void main(String[] args) {

        int a = 112256;
        int b = 610850;
        int c;
        int d;
        int z;

        for (int i = a; i > 0; i = i/10) {
            c = i%10;

            for (int j = b; j > 0; j = j / 10) {
                d  = j%10;

                if (c == d) {
                    z = c;

                    System.out.println("commonDigit is " + z);
                }
            }
        }
    }
}

