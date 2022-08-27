package OOP;

import java.util.Scanner;

public class Main_Person {
    public static void main (String[] args){

 // Метод позволяющи читать с консоли
        Scanner sc= new Scanner(System.in);
        System.out.print ("Введите ваше имя:");
        String name= sc.nextLine();

        System.out.print ("Введите ваше отчество:");
        String middleName= sc.nextLine();

        System.out.print ("Введите вашу фамилию:");
        String familyName= sc.nextLine();

        Person person = new Person (name, middleName, familyName);

        System.out.print ("Спасибо! Вы ввели:" + person);

    }
}
