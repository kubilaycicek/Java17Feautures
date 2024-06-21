package org.kubilaycicek.improvements;


import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;


public class Demo {
    public static void main(String[] args) {

        // Compact Number Formatting Support
        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        System.out.println(shortFormat.format(1000));

        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        System.out.println(shortFormat.format(1000));

        // Day Period Support Added
        DateTimeFormatter timeOfDayFomatter = DateTimeFormatter.ofPattern("B");
        System.out.println(timeOfDayFomatter.format(LocalTime.of(8, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(13, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(20, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(23, 0)));
        System.out.println(timeOfDayFomatter.format(LocalTime.of(0, 0)));

        var user = new User("Kubilay", null);
        HashMap<String,User> users = new HashMap<>();
        users.put("1",user);

        // Helpful NullPointerException

        users.get(1).surname();
        /*
        * Cannot invoke "org.kubilaycicek.improvements.User.surname()" because the return value of "java.util.HashMap.get(Object)" is null
	        at org.kubilaycicek.improvements.Demo.main(Demo.java:33)
        * */

    }
}

record User(String name, String surname) {
}