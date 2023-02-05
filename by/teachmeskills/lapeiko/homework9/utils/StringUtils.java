package by.teachmeskills.lapeiko.homework9.utils;

import java.util.Scanner;

public class StringUtils {
    /* Task1
Объяви в StringUtils функцию print, которая принимает массив символов (строку)
и выводит его на консоль как символы, идущие подряд друг за другом.
Объяви в StringUtils функцию println, которая делает то же, что и print,
но ещё выводит символ переноса строки в конце.
 */
    public static void print(char[] chars) {
        for (char i : chars) {
            System.out.println(i);
        }
    }

    public static void println(char[] chars) {
        print(chars);
        System.out.print('\n');
    }

    /* Task2
    Объяви в StringUtils функцию isBlank,
    которая принимает массив символов (строку) и возвращает,
    является ли эта строка пустой. Считаем строку пустой,
    если у неё длина 0 или если она состоит только из пробельных символов.
     */
    public static boolean isBlank(char[] chars) {
        for (char i = 0; i < chars.length; i++) {
            if (!Character.isWhitespace(i)) {
                return false;
            }
        }
        return true;
    }

    /* Task3
    Объяви функцию isRussian, которая принимает
    массив символов и возвращает, состоит ли он
    полностью из символов русского алфавита.
     */
    public static boolean isRussian(char[] chars) {
        boolean isRussian = false;
        for (char i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'А' && chars[i] <= 'я') || chars[i] == 'ё' ||
                    chars[i] == 'Ё') {
                isRussian = true;
            } else {
                isRussian = false;
            }
        }
        return isRussian;
    }

    /* Task4
    Объяви в StringUtils функцию contains,
    которая принимает 2 массива символов и возвращает,
    является ли второй подмассивом первого. Другими словами,
    содержит ли первая строка участок символов, который 1-в-1
    совпадает со второй строкой. Например, «Hello» содержит «ell»,
    «Hello world» содержит «world», «Hello» не содержит «Hi».
    */
    public static boolean contains(char[] chars, char[] subChars) {
        if (chars.length == 0 || subChars.length > chars.length) {
            throw new IllegalArgumentException("Error. Verify your program.");
        }
        int sum = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < subChars.length; j++) {
                if (chars[i + j] != subChars[j]) {
                    break;
                } else {
                    sum++;
                }
            }
            if (sum == subChars.length) {
                return true;
            }
        }
        return false;
    }
    /* Task5
    Объяви в StringUtils функцию parseInt, которая принимает массив
    символов десятичных цифр и возвращает int число, написанное в строке.
    Например, для строки «1295» должно вернуться int число 1295.
    🛟 Подсказка:
    В Unicode символы цифр идут подряд по-очереди от '0' до '9'.
    Символ в Java – числовой тип данных. Он поддерживает арифметические
    операции, в том числе вычитание.
    🛟 Подсказка:
    Вероятно, тебе понадобится возведение в разные степени числа 10.
    Для возведения в степень есть функция int Math.pow(int, int).
    Pow – сокращение от power.
         */
//        public static void parseInt (char[] chars){
//        }
    public static char[] getCharArray(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toCharArray();
    }
}


