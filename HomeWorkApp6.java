package ru.geekbrains.lesson1;
/**
 * Java. Lesson 1. Homework 6
 * @author Yaforov Roman
 * @version Date: 13.04.2022 г.
 */

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Animal cat = new Cat(200, 0);
        System.out.println("Cat:");
        System.out.println("Кошка пробежала: " + cat.run(200) + " м.");
        System.out.println("Кошка проплыла: " + cat.swim(3) + " м. Утонула! Кошка не умеет плавать!");
        Animal dog = new Dog(500, 10);
        System.out.println("Dog:");
        System.out.println("Собака пробежала: " + dog.run(200) + " м.");
        System.out.println("Собака проплыла: " + dog.swim(15) + " м.");
    }
}

class Cat extends Animal {
    Cat(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
    }
}

class Dog extends Animal {
    Dog(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
    }
}

abstract class Animal {
    protected int speed_limit;
    protected int swim_limit;

    Animal(int speed_limit, int swim_limit) {
        this.speed_limit = speed_limit;
        this.swim_limit = swim_limit;
    }

    protected int run(int speed) {
        if (speed <= speed_limit) {
            return speed;
        }
        return speed_limit;
    }

    protected int swim(int distance) {
        if (distance <= swim_limit) {
            return distance;
        }
        return swim_limit;
    }
}