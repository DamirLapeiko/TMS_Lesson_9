Lesson 9
🏠 ДЗ №9

В ДЗ ты будешь писать свои функции для работы со строками. Только вместо класса String будешь работать с массивом символов. Это позволит лучше понять, как внутри устроены строковые типы данных в языках программирования. 

1️⃣ 🟢
Создай Java проект в IDE.
Создай в папке исходного кода уникальный базовый package. Например, by.teachmeskills.<фамилия>.homework9.
Создай класс  <базовый package>.util.StringUtils.
Объяви в StringUtils функцию print, которая принимает массив символов (строку) и выводит его на консоль как символы, идущие подряд друг за другом.
Объяви в StringUtils функцию println, которая делает то же, что и print, но ещё выводит символ переноса строки в конце. 

2️⃣ 🟢
Объяви в StringUtils функцию isBlank, которая принимает массив символов (строку) и возвращает, является ли эта строка пустой. Считаем строку пустой, если у неё длина 0 или если она состоит только из пробельных символов.

3️⃣ 🟢
Объяви функцию isRussian, которая принимает массив символов и возвращает, состоит ли он полностью из символов русского алфавита.

4️⃣ 🟡
Объяви в StringUtils функцию contains, которая принимает 2 массива символов и возвращает, является ли второй подмассивом первого. Другими словами, содержит ли первая стока участок символов, который 1-в-1 совпадает со второй строкой. Например, «Hello» содержит «ell», «Hello world» содержит «world», «Hello» не содержит «Hi».

5️⃣ 🟠 
Объяви в StringUtils функцию parseInt, которая принимает массив символов десятичных цифр и возвращает int число, написанное в строке. Например, для строки «1295» должно вернуться int число 1295.
🛟 Подсказка:
В Unicode символы цифр идут подряд по-очереди от '0' до '9'.
Символ в Java – числовой тип данных. Он поддерживает арифметические операции, в том числе вычитание.
🛟 Подсказка: 
Вероятно, тебе понадобится возведение в разные степени числа 10. Для возведения в степень есть функция int Math.pow(int, int). Pow – сокращение от power. 

6️⃣ 🟢
Создай класс
<базовый package>.HomeWork9 с функцией main.
Запроси у пользователя число от 2 до 5 – номер задачи. По номеру должна происходить демонстрация работы соответствующей задачи. 
Запроси у пользователя входные аргументы функции. Для ввода массивов символов используй:
char[] string = scanner.nextLine().toCharArray();
Вызови функцию с пользовательскими аргументами и выведи её результат на консоль.
Для вывода массива символов используй функции из задачи 1.

‼️ Функции 2-5 не делают ввод и вывод на консоль. Они работают только с входными параметрами и возвращаемым значением.
‼️ main функция должна быть только одна: в классе HomeWork9
‼️ Перед git коммитами выполняем автоформатирование всех файлов
