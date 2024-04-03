package com.sam;

public class School {
    private Principal principal;
    private Teacher teacher;
    private Staff staff;
    private NonAcademicStaff nonAcademicStaff;
    private Student student;
    private Course course;
    private SchoolClass theClass;
    private  Applicant applicant;

    public School(Principal principal, Teacher teacher, Staff staff, NonAcademicStaff nonAcademicStaff, Student student, Course course, SchoolClass theClass, Applicant applicant) {
        this.principal = principal;
        this.teacher = teacher;
        this.staff = staff;
        this.nonAcademicStaff = nonAcademicStaff;
        this.student = student;
        this.course = course;
        this.theClass = theClass;
        this.applicant = applicant;
    }
    public void scheduleAssembly(String assemblyDetails) {
        System.out.println("Scheduling school assembly with details: " + assemblyDetails);
    }

    public void displayClassInformation(SchoolClass schoolClass) {
        System.out.println("Class Information: " + schoolClass.getClassDetails());
    }


    public Principal principal() {
        return principal;
    }

    public Teacher teacher() {
        return teacher;
    }

    public Staff staff() {
        return staff;
    }

    public NonAcademicStaff nonAcademicStaff() {
        return nonAcademicStaff;
    }

    public Student student() {
        return student;
    }

    public Course course() {
        return course;
    }

    public SchoolClass theClass() {
        return theClass;
    }

    public Applicant applicant() {
        return applicant;
    }
}
