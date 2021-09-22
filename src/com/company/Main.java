package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // задание 7


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


 // задание 8


 Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scanner.nextInt();
        System.out.println("Введите длинну строк");
        int l = scanner.nextInt();
        int[][] array = new int[n][l];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Заполните массив, введите элемент находящийся в строке " + i + " в столбце " + j );
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


        // задание 9


        int summ = 0;
        for(String arg : args) {
            int conv = Integer.parseInt(arg);
            summ += + conv;
        }
        System.out.println(summ);


        //задание 10


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк ");
        int n = scanner.nextInt();
        System.out.println("Введите длинну строк");
        int l = scanner.nextInt();
        int[][] array = new int[n][l];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    array[i][j] = 1 + i;
                    a = array[i][j];
                }
                else {
                    array[i][j] = a + n;
                    a = array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
