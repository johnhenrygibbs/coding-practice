package com.practice.oop;

import static com.practice.oop.Message.message;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box(4.6, 7.9, 9.9);
        Box box2 = new Box(box1);

        System.out.println(box1.length + " " + box1.width + " " + box1.height);
        System.out.println(box2.length + " " + box2.width + " " + box2.height);

        WeightedBox box3 = new WeightedBox();
        WeightedBox box4 = new WeightedBox(1, 2, 3, 4);
        System.out.println(box3.length + " " + box3.width + " " + box3.height + " " + box3.weight);

        // The type of the reference variable and not the type of the object determines what members can be accessed.

        // So in the example below, you can access length, width, and height, but not weight.

        Box box5 = new WeightedBox(1, 2, 3, 4);
        System.out.println(box5.length);
        System.out.println(box5.width);
        System.out.println(box5.height);

        // Single inheritance using three levels (BoxPrice, WeightedBox, Box).

        BoxPrice box = new BoxPrice(5, 8, 200);

        // These three reference variables will point to the same instance object.

        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        Singleton object3 = Singleton.getInstance();

        Human john = new Human(34, "John", 100000, true);
        Human matt = new Human (39, "Matt", 100000, true);

        System.out.println(Human.population);

        Student one = new Student();
        Student two = one;

        one.name = "New Name";
        System.out.println(two.name);

        one.greetMe();
        message();

    }

}
