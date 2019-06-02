package Sotiralgorythmen;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] unsortiert = { 4, 1, 8, -3, 5, 7 };
        final long timeStart2 = System.nanoTime();

        int[] sortiert = selectionsort(unsortiert);

        final long timeEnd2 =System.nanoTime();
        for (int i = 0; i < sortiert.length; i++) {
            System.out.print(sortiert[i] + ", ");
        }
        System.out.println("Laufszeit: " + (timeEnd2 - timeStart2) + " Nanosek.");
        final long timeStart = System.nanoTime();


        int[] sortiert2 = unsortiert;
                Arrays.sort(sortiert2);

        final long timeEnd =System.nanoTime();
        for (int i = 0; i < sortiert2.length; i++) {
            System.out.print(sortiert2[i] + ", ");
        }
        System.out.println("Laufszeit: " + (timeEnd - timeStart) + " Nanosek.");



    }

    public static int[] selectionsort(int[] sortieren) {
        for (int i = 0; i < sortieren.length - 1; i++) {
            for (int j = i + 1; j < sortieren.length; j++) {
                if (sortieren[i] > sortieren[j]) {
                    int temp = sortieren[i];
                    sortieren[i] = sortieren[j];
                    sortieren[j] = temp;
                }
            }
        }

        return sortieren;
    }








}
