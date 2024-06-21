package org.kubilaycicek.records;

import java.util.Random;
import java.util.UUID;

public record Employee(int id, String firstName, String lastName) {

    public Employee {
        if (id < 100) {
            throw new IllegalArgumentException("Employee Id cannot be below 100.");
        }
        if (firstName.length() < 2) {
            throw new IllegalArgumentException("First name must be 2 characters or more.");
        }
    }

    public Employee(int id, String firstName) {
        this(id, firstName, null);
    }

    public void getFullName() {
        if (lastName == null) {
            System.out.println(firstName());
        } else {
            System.out.println(firstName() + " " + lastName());
        }
    }

    public static UUID generateEmployeeUUID(){
        return UUID.randomUUID();
    }

}
