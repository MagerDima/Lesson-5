package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// задани 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " четное число");
        }
        else
            System.out.println(number + " нечетное число");

// задание 10
        System.out.println("Введите число:");
        int dayNumber = scanner.nextInt();
        switch(dayNumber) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
                System.out.println("Суббота");
                break;
            case (7):
                System.out.println("Воскресение");
                break;
            default:
                System.out.println("Введено некорректное число");
        }
    }
}
