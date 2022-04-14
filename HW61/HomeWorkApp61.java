package HW61;


import static HW61.Animal1.stat;

public class HomeWorkApp61 {

    public static void main(String[] args) {
        Animal1[] animal1 = new Animal1[3];
        animal1[0] = new Cat1(100, 5);
        animal1[1] = new Dog1(600, 1);
        animal1[2] = new Dog1(400, 4);

        for (Animal1 an : animal1) {
            System.out.println(an);
        }
        System.out.println("Количество созданных животных: " + stat); // подсчет созданных котов, собак и животных.
    }
}
