package HW61;


class Dog1 extends Animal1 {
    Dog1(int speed, int distance) {
        super(speed, distance);
        speed_limit = 500;
        swim_limit = 10;
        type = "Собака:";
    }
}
