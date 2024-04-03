package com.sam;

public class Staff {
    private String name;
    private int age;
    private String role;

    public Staff(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public void performResponsibilities() {
        System.out.println("Performing generic staff responsibilities.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}