/**
 * Java. Lesson 1. Homework 5
 * @author Yaforov Roman
 * @version Date: 08.04.2022 г.
 */

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivanov@mail.com", "8 666 323 66 66", 60000, 30);
        persArray[1] = new Person("Iv Iin", "Accountant", "ivlin@mail.com", "8 888 323 66 66", 20000, 42);
        persArray[2] = new Person("Petrovich Petr", "Plumber", "petr@mail.com", "8 777 323 66 66", 15000, 50);
        persArray[3] = new Person("Susanin Ivan", "Locksmith", "susiv@mail.com", "8 333 323 66 66", 18000, 60);
        persArray[4] = new Person("Sysic Rik", "Conductor", "sysic@mail.com", "8 222 323 66 66", 12000, 10);
        for (Person person : persArray){
            if (person.getAge() > 40)
                System.out.println(person);
        }
    }
}

/**
 * Class Person - Сотрудник
 */

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name +
                "\n| Position: " + position +
                "\n| Email: " + email +
                "\n| Phone: " + phone +
                "\n| Salary: " + salary +
                "\n| Age: " + age);
    }
}
