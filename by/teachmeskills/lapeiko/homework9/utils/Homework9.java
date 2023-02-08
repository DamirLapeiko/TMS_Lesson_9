package by.teachmeskills.lapeiko.homework9.utils;
/*
Создай класс <базовый package>.HomeWork9 с функцией main.
Запроси у пользователя число от 2 до 5 – номер задачи.
По номеру должна происходить демонстрация работы соответствующей задачи.
Запроси у пользователя входные аргументы функции. Для ввода массивов символов используй:
char[] string = scanner.nextLine().toCharArray();
Вызови функцию с пользовательскими аргументами и выведи её результат на консоль.
Для вывода массива символов используй функции из задачи 1.
 */

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What task do you want to see? Enter a number from 2 to 5: ");
        int taskNumber = sc.nextInt();
        switch (taskNumber) {
            case 2 -> {
                char[] string;
                System.out.print("Create a new string: ");
                string = StringUtils.getCharArray();
                System.out.println("Is this text blank or not?");
                System.out.println(StringUtils.isBlank(string));
            }
            case 3 -> {
                char[] string;
                System.out.print("Create a new string: ");
                string = StringUtils.getCharArray();
                System.out.println("Does this text contain only russian letters?");
                System.out.println(StringUtils.isRussian(string));
            }
            case 4 -> {
                System.out.println("Create the first array: ");
                char[] string = StringUtils.getCharArray();
                System.out.println("Create the second array: ");
                char[] string1 = StringUtils.getCharArray();
                System.out.println("Does second array contain first array?");
                System.out.println(StringUtils.contains(string, string1));
            }
            case 5 -> {
                char[] string;
                System.out.print("Write different numbers: ");
                string = StringUtils.getCharArray();
                System.out.println(StringUtils.parseInt(string));
            }
                default -> System.out.println("Wrong number of task");
            }
        }
    }