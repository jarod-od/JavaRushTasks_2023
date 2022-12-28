package com.jarod.javarush.lvl_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
И 18-ти достаточно
Введи с клавиатуры имя и возраст. Если возраст больше 20, выведи надпись: «И 18-ти достаточно».

Requirements:
1. Программа должна считывать строки c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если возраст больше 20, вывести только сообщение "И 18-ти достаточно".
4. Если возраст меньше либо равно 20, ничего не выводить.
 */

public class Lection_09_1 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры
        String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.


    }

}
