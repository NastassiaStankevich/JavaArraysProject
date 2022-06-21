package by.itstep.stank.javalessons.lesson18_19.controller;

import by.itstep.stank.javalessons.lesson18_19.model.logic.ArraySearcher;
import by.itstep.stank.javalessons.lesson18_19.model.logic.ArrayWorker;
import by.itstep.stank.javalessons.lesson18_19.util.ArrayInitializer;
import by.itstep.stank.javalessons.lesson18_19.util.Convertor;
import by.itstep.stank.javalessons.lesson18_19.view.Printer;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;

        do {

            Printer.print("Input size of array: ");
            size = scanner.nextInt();
        } while ( size <= 0);

        int[] array = new int[size];

        ArrayInitializer.randomInit(array);

        Printer.print("Array before: " + Convertor.toString(array));
        ArrayWorker.reverse(array);


        Printer.print("\nArray after: " + Convertor.toString(array));


    }

    }

