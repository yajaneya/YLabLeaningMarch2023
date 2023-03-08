package lesson1.task4;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) throws Exception{
        int number = new Random().nextInt(100);
        int maxAttempts = 10;
        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " попыток угадать.");
        try (Scanner scanner = new Scanner(System.in)){
            while (maxAttempts > 0) {
                maxAttempts--;
                int n = scanner.nextInt();
                if (number == n) {
                    System.out.println("Ты угадал c " + (10 - maxAttempts) + " попытки!");
                    break;
                }
                if (number > n) {
                    System.out.println("Мое число больше! Осталось " + maxAttempts + " попыток");
                } else {
                    System.out.println("Мое число меньше! Осталось " + maxAttempts + " попыток");
                }
            }
            if (maxAttempts == 0) {
                System.out.println("Ты не угадал");
            }
        }
    }
}
