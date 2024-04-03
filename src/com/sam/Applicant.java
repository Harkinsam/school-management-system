package com.sam;

public class Applicant {
    private String name;
    private int age;
    private int gradeLevel;
    private String applicationStatus;

    public Applicant(String name, int age, int gradeLevel, String applicationStatus) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
        this.applicationStatus = "pending";
    }

    public void submitApplication(){
        if(age >= 5 && age <= 18 && gradeLevel >=2 && gradeLevel <=12){
            applicationStatus = "Summited";
            System.out.println(name + "'s application has been submitted");
        }else {
            System.out.println("Sorry, application not submitted.  " + name + " does not meet the age or grade level criteria for the admission");
        }
    }
    public String applicationStatus() {
        return applicationStatus;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public int gradeLevel() {
        return gradeLevel;
    }

}
