package HW61;

class Animal1 {
    protected int speed_limit;
    protected int swim_limit;
    protected int speed;
    protected int distance;
    protected String type;
    protected static int stat = 0;

    Animal1(int speed, int distance) {
        this.speed_limit = speed_limit;
        this.swim_limit = swim_limit;
        this.speed = speed;
        this.distance = distance;
        type = "Animal";
        stat++;
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

    @Override
    public String toString() {
        return (type +
                "\n| Пробежала: " + run(speed) + " м." +
                "\n| Проплыла: " + swim(distance) + " м.");
    }
}
