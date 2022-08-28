package Math;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона:");
        double a = scanner.nextInt();

        System.out.print("Введите конец диапазона:");
        double b = scanner.nextInt();

        double i = a;
        double sum = 0;

        while (i <= b) {
            sum = sum + i;
            ++i;
        }

        double average = sum /(b-a+1);

        System.out.println("Среднее арифметическое "+ average);

        double evenNumbers = 0;
        double sum2 = 0;

        for(double k = a; k<=b; k++)
        {
            if (k % 2 == 0) {
                evenNumbers++;
                sum2 = sum2 + k;
            }
        }

        double average2 = sum2 / evenNumbers;

        System.out.println("Среднее арифметическое четных чисел "+ average2);
        }
    }
