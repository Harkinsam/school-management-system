package com.sam;

public class Course {
    private String subject;
    private Teacher teacher;

    public Course(String subject, Teacher teacher) {

        this.subject = subject;
        this.teacher = teacher;
    }


    public void assignGrade(Student student, String grade) {
        System.out.println("Assigning grade " + grade + " to student: " + student.getFullName());
        // Additional logic can be added here
    }
    public void displayCourseInfo() {
        System.out.println("Course: " + subject);
        System.out.println("Teacher: " + teacher.getName());
        // Additional course information can be displayed here
    }

    public String subject() {
        return subject;
    }

    public Teacher teacher() {
        return teacher;
    }
}
