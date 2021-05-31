package by.epam.unit03.main;

public class Task03 {

    public static void main (String [] args) {

        int x;
        long sum = 0;
        long res = 1;

        for (x = 1; x < 11; x++) {
            sum = sum + x;
            res = res * sum;
        }
        System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) = " + res);
    }
}
