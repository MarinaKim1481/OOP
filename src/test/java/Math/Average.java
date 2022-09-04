package Math;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона:");
        double a = scanner.nextDouble();

        System.out.print("Введите конец диапазона:");
        double b = scanner.nextDouble();

        double sum = 0;
        double evenNumbers = 0;
        double notEvenNumbers = 0;
        double sum2 = 0;

       while (a <= b) {
           if (a % 2 == 0) {
               sum2 = sum2 + a;
               ++evenNumbers;
               ++a;
           }
           else {
               sum = sum + a;
               ++notEvenNumbers;
               ++a;
           }
       }
        double average = (sum2 + sum) /(evenNumbers + notEvenNumbers);
        double average2 = sum2 / evenNumbers;

        System.out.println("Среднее арифметическое четных чисел "+ average2);
        System.out.println("Среднее арифметическое "+ average);

        }
    }
