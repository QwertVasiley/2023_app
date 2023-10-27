package com.example.a2023_app;

import java.util.Objects;
import java.util.Random;

public class GameLogic {
    static char[] charCompArray = new char[4];
    static String numberStringComp;

    public GameLogic() {
    }

    public static String rand() {   //генерирую рандомное число
        Random random = new Random();
        int min = 1000;
        int max = 9999;
        int compNum = random.nextInt((max - min) + 1) + min;
        numberStringComp = Integer.toString(compNum);
        System.out.println(compNum + "еще не готово число");
        charCompArray = numberStringComp.toCharArray();
        checkForDuplicates(charCompArray);
        return numberStringComp;
    }

    public static void checkForDuplicates(char[] chars) {
        // для каждого элемента массива проверяем, встречается ли он потом в массиве
        for (int i = 0; i < charCompArray.length; i++) {
            for (int j = i + 1; j < charCompArray.length; j++) {
                if (Objects.equals(charCompArray[i], charCompArray[j])) {
                    rand();
                }
            }
        }
    }

    public static char[] tru(char[] compNumb, char[] userNumb) { //поиск точного совпадения
        char[] arr = new char[4];
        for (int i = 0; i < 4; i++) {
            if (compNumb[i] == userNumb[i]) {
                arr[i] = 1;
            }
        }
        return arr;
    }

    public static char[] yeloTru(char[] compNumb, char[] userNumb) { //поиск не точного совпадения
        char[] arr = new char[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (compNumb[j] == userNumb[i] && j != i) {
                    arr[i] = 1;
                }
            }
        }
        return arr;
    }
}