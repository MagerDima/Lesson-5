package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
int n = scanner.nextInt();
int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Заполните массив, введите элемент под индексом " + i );
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
