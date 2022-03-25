package com.company;

import java.util.Arrays;

public class Main {
    public static void printYearLeap(int year) {                                         // тут метод к первому заданию.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - это високосный год!");
        } else {
            System.out.println("Ура! " + year + " - год не является високосным!");
        }
    }

    public static void printClientOs(int clientOs, int clientDeviceYear) {               // тут метод к второму заданию.
        if (clientOs > 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию приложения для Android по ссылке");
        } else if (clientOs > 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs < 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию приложения для iOS по ссылке");
        } else if (clientOs < 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int DeliveryTime(int deliveryDistance) {                              // тут метод к третьему заданию.
        int deliveryTime = 1;
        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        if (deliveryDistance > 100) {
            deliveryTime++;
        }
        if (deliveryDistance >= 101) {
            throw new UnsupportedOperationException("Доставка банковской карты не осуществляется");
        }
        return deliveryTime;
    }

    public static void searchDuplicateChar(String letters) {                          // тут метод к четвертому заданию.
        char[] words = letters.toCharArray();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i] == words[j]) {
                    System.out.println("есть дубликат символа, это первый задублированый символ - " + words[i]);
                    return;
                }
            }
        }
        System.out.println("дубликатов нет");
    }

    public static void reverseChar(int[] arr) {                                           // тут метод к пятому заданию.
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2000;
        printYearLeap(year);

        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2014;
        printClientOs(clientOs, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        System.out.println("Доставка банковской карты возможна в пределах " + DeliveryTime(deliveryDistance) + " дней");

        System.out.println("Задание 4");
        String letters = "abcdeff";
        searchDuplicateChar(letters);

        System.out.println("Задание 5");
        int[] arr = {3, 2, 1, 6, 5};
        reverseChar(arr);
        System.out.println(Arrays.toString(arr));
    }
}


