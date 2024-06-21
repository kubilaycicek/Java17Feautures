package org.kubilaycicek.records;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Fruit> list = List.of(new Fruit("Banana", 10.0),new Fruit("Apple", 6.0),new Fruit("Orange", 9.0));

        list.forEach(System.out::println);
    }
}
