package main.java.com.sam;

public class Student {
    private String firstName;

    private String lastName;
    private int age;
    private int gradeLevel;


    public Student(String firstName, String lastName, int age, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gradeLevel = gradeLevel;

    }

    public void takeCourse(Course course) {
        System.out.println(this.getFullName() + " is taking the course on " + course.subject());
    }


    public boolean isSenior(){
        return gradeLevel >= 6;
    }
    public boolean isJunior() {
        return gradeLevel < 6;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + getFullName());
        System.out.println("Age: " + age());
        System.out.println("Grade Level: " + gradeLevel());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public int age() {
        return age;
    }

    public int gradeLevel() {
        return gradeLevel;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}



