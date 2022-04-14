package HW61;


class Cat1 extends Animal1 {
    Cat1(int speed, int distance) {
        super(speed, distance);
        speed_limit = 200;
        swim_limit = 0;
        type = "Кошка:";
    }
}
