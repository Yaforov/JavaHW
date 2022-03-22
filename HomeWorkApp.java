
/**
 * Java. Lesson 1. Homework 1
 * Yaforov Roman
 * Date: 22.03.2022 г.
 */
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    // Задание №2: Создать метод, для вывода в столбец следующие слова: Orange, Banana, Apple
    public static void printThreeWords () {
      System.out.println("Orange");
      System.out.println("Banana");
      System.out.println("Apple");
    }
    /** Задание №3: Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
     * инициализируйте их любыми значениями, которыми захотите. Далее метод должен
     * просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в
     * консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */
    public static void checkSumSign () {
        int a = 2;
        int b = -3;
        if ((a + b) >= 0) {
            System.out.println("The amount is positive!");
        } else System.out.println("The amount is negative!");
    }
    /** Задание №4: Создайте метод printColor() в теле которого задайте int переменную value и
     * инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль
     * метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно)
     * до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
     */
    public static void printColor () {
        int value = 10;
        if (value <= 0) {
            System.out.println("Red!");
        } if (value > 0 && value <= 100) {
            System.out.println("Yellow!");
        } if (value > 100 ) {
            System.out.println("Green!");
        }
    }
    /** Задание №5: Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо
     * вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
      */
    public static void compareNumbers () {
        int a = 3;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
