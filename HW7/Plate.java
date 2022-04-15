package HW7;
/**
 * Java. Lesson 1. Homework 7
 * @author Yaforov Roman
 * @version Date: 14.04.2022 г.
 */

public class Plate {
    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        if (food < n) return false;
        food -= n;
        return true;
    }

     void add(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "В тарелке еды: " + food;
    }
}
