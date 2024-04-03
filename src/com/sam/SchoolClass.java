package com.sam;

public class SchoolClass {
    private int gradeLevel;
    private  String className;
    private  Teacher teacher;

    public SchoolClass(int gradeLevel, String className) {
        this.gradeLevel = gradeLevel;
        this.className = className;
    }
    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClassDetails() {
        String details = "Grade Level: " + gradeLevel + ", Class Name: " + className;
        if (teacher != null) {
            details += ", Teacher: " + teacher.getName();
        }
        return details;
    }


    public int gradeLevel() {
        return gradeLevel;
    }

    public Teacher teacher() {
        return teacher;
    }

    public String className() {
        return className;
    }
}
