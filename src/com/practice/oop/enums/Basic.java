package com.practice.oop.enums;

public class Basic {

    // Days of the week below are enum constants (public, static, and final).

    // Since they are final, you can't create child enums.

    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {

            System.out.println("Constructor called for " + this);

        }

        // This is not public or protected, only private or default.

        // We don't want to create new objects, because that's not an enum concept.

        // Internally, public static final Week Monday = new Week;

    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;

        for (Week day : week.values()) {

            System.out.println(week.ordinal());

        }

    }

}
