package by.itstep.stank.javalessons.lesson18_19.util;

import by.itstep.stank.javalessons.lesson18_19.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class ArrayInitializer {
    public static final int  MAX_NUMBER = 100;
    public static  final int MIN_NUMBER = 0;



    public static void userInit (int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length ; i++) {
            Printer.print(String.format("element [%d]: ", i + 1));
            array [i] = scanner.nextInt();
        }
    }


    public static void randomInit(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;

        }
    }

}
