/**
 * Java. Lesson 1. Homework 3
 * @author Yaforov Roman
 * @version Date: 29.03.2022 г.
 */
import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal(5);
        lenArrayInitialValue(5, 10);
        System.out.println(Arrays.toString(findMinMax(new int[] {2, 5, 5, 8, 6, 8, 11, 9})));
    }

    /** Задание №1: Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            array[i] = array[i] == 1? 0 : 1;
        System.out.println(Arrays.toString(array));
    }

    /** Задание №2: Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        } System.out.println(Arrays.toString(arr));
    }

    /** Задание №3: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        } System.out.println(Arrays.toString(array));
    }

    /** Задание №4: Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    static void fillDiagonal(int size) {
        int[] [] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i] [i] = 1;
            arr[i] [size - i - 1] = 1;
        }
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(arr[i]));
    }

    /** Задание №5: Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    static void lenArrayInitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = initialValue;
        System.out.println(Arrays.toString(arr));
    }

    /** Задание №6:* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     *
     */
    static int[] findMinMax(int[] array) {
        int[] minmax = new int[2];
        minmax[0] = minmax[1] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minmax[0] > array[i])
                minmax[0] = array[i];
            if (minmax[1] < array[i])
                minmax[1] = array[i];
        } return minmax;
    }
}
