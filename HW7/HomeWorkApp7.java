package HW7;
/**
 * Java. Lesson 1. Homework 7
 * @author Yaforov Roman
 * @version Date: 14.04.2022 г.
 */

public class HomeWorkApp7 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Viscas", 3);
        cats[2] = new Cat("Lis", 15);
        Plate plate = new Plate(20);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate + " - Осталось!");
        plate.add(40);
        System.out.println(plate + " - после добавления!");
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate + " - Осталось!");
    }
}
