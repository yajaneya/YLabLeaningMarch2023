package lesson1.task2;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            System.out.println(calc(n));
        }
    }

    public static int calc (int n) {
        if (n < 2) {
            return n;
        }
        int p0 = 0;
        int p1 = 1;
        int p = 0;
        for (int i = 1; i < n; i++) {
            p = 2 * p1 + p0;
            p0 = p1;
            p1 = p;
        }
        return p;
    }
}
