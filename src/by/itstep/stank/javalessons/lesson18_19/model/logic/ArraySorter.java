package by.itstep.stank.javalessons.lesson18_19.model.logic;

public class ArraySorter {
    public static void bubbleSortAcs(int[] array) {

    }




    public static void selectedSortAcs(int[] array) {

        for (int j = 0; j < array.length - 1; j++) {
            int index = j;
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] > array[index]) {
                    index = i;
                }
            }

            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;

        }
    }

}

