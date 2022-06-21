package by.itstep.stank.javalessons.lesson18_19.controller;

import by.itstep.stank.javalessons.lesson18_19.model.logic.ArrayWorker;
import by.itstep.stank.javalessons.lesson18_19.util.ArrayInitializer;
import by.itstep.stank.javalessons.lesson18_19.util.Convertor;
import by.itstep.stank.javalessons.lesson18_19.view.Printer;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;

        do {

            Printer.print("Input size of array: ");
             size = scanner.nextInt();
        } while ( size <= 0);

        int[] array = new int[size];

        ArrayInitializer.userInit(array);
        ArrayInitializer.randomInit(array);

        Printer.print(Convertor.toString(array));

        // logic

        int s = ArrayWorker.sum(array);
        int max = ArrayWorker.max(array);
        int min = ArrayWorker.min(array);
        double avg = ArrayWorker.avg(array);

        String msg = String.format("\nSum of array elements = %d.\n" +
                "Max elements  =%d.\n" +
                "Min elements = %d. \n" +
                "Average sum = %.2f" ,s, max, min, avg);

        //output result
        Printer.print(msg);




    }
}
