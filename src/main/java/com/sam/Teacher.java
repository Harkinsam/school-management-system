package main.java.com.sam;

public class Teacher extends Staff {
    private String subject;


    public Teacher(String name, int age, String subject) {
        super(name, age, "Teacher");
        this.subject = subject;

    }

    public String subject() {
        return subject;
    }

    public void teachCourse(Course course) {
        System.out.println(this.getName() + " is taking the course on " + course.subject());
    }

    public void displayTeacherDetails() {
        System.out.println("Teacher: " + this.getName());
        System.out.println("Subject: " + this.subject);
        System.out.println("Age: " + this.getAge());
        System.out.println("Role: " + this.getRole());
    }

    public boolean isTeacher() {
        return true;
    }
    @Override
    public String toString() {
        return getName();
    }



    @Override
    public void performResponsibilities() {
        System.out.println(getName() + " is teaching " + subject);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}

