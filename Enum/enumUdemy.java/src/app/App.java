package app;

import package1.Dog;
import package2.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Dog d1 = new Dog();
        Person p1 = new Person();
        d1.bark();
        p1.Hello();
    }
}
