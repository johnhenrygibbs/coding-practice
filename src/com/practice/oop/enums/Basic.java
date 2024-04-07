package com.practice.oop.enums;

public class Basic {

    // Days of the week below are enum constants (public, static, and final).

    // Since they are final, you can't create child enums.

    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {

            System.out.println("Constructor called for " + this);

        }

        @Override
        public void hello() {
            System.out.println("Hey, how are you?");
        }

        // This is not public or protected, only private or default.

        // We don't want to create new objects, because that's not an enum concept.

        // Internally, public static final Week Monday = new Week;

    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

        for (Week day : week.values()) {

            // Ordinal here refers to index.

            System.out.println(week.ordinal());

        }

    }

}
