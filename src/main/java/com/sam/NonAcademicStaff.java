package main.java.com.sam;

public class NonAcademicStaff {
    private String name;
    private int age;
    private String role;
    private double salary;

    public NonAcademicStaff(String name, int age, String role, double salary) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Salary: #" + salary);
    }
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
    public void assignRole(String newRole) {
        this.role = newRole;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public String role() {
        return role;
    }

    public double salary() {
        return salary;
    }
}
