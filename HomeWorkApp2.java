
/**
 * Java. Lesson 1. Homework 2
 * @author Yaforov Roman
 * @version Date: 25.03.2022 г.
 */

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(winthin10and20(-20,10));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-5)); //true, если число отрицательное, и false - если положительное.
        printWorldNTimes("Bay World!",2);
        System.out.println(checkYear (1984));
    }

    /** Задание №1: Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в риделах
     * от 10 до 20 (включительно), если да - вернуть true, в противном случае - false.
     */
    public static boolean winthin10and20 (int x1, int x2) {
        int sum = x1 + x2;
        return (10 <= sum && sum <= 20)? true : false;
    }

    /** Задание №2: Написать метод, которому в качестве параметра педерается целое число, метод должен
     * должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: Ноль - считаем положительным числом.
     */
    public static void isPositiveOrNegative (int x) {
        System.out.println((x >= 0)? "Positive!" : "Negative!");
    }

    /** Задание №3: Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и false - если положительное.
     */
    public static boolean isNegative (int x) {
        return ( x < 0 )? true : false;
    }

    /** Задание № 4: Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
     * в консоль указанную строку, указанное количество раз.
     */
    public static void printWorldNTimes (String world, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(world);
        }
    }

    /** Задание № 5: Написать метод, который оприделяет является ли год высокосным, и возвращает
     *boolean (высокосный - true). Каждый 4-й год является высокосным, кроме каждого 100-го,
     * при этом каждый 400 является высокосным годом.
     */
    public static boolean checkYear (int y) {
        return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)? true : false;
    }
}
