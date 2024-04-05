package com.sam;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        Applicant applicant1 = new Applicant("tolu", 12,4, "");
//        applicant1.submitApplication();
//         String status = applicant1.applicationStatus();
//        System.out.println(status);
//
//        Staff staff = new Staff("dele", 34, "counsellor");
//        staff.displayInfo();
//        Teacher teacher = new Teacher("cole",23,"english");
//        teacher.displayTeacherDetails();
//        SchoolClass schoolClass = new SchoolClass(4, "Basic two");
//        Teacher teacher1 = new Teacher("cole",23,"english");
//        String classDetails = schoolClass.getClassDetails();
//        System.out.println(classDetails);
//        NonAcademicStaff staff1 = new NonAcademicStaff("John Doe", 35, "Administrative Assistant", 40000.0);
//        staff1.updateSalary(45000);
//        staff1.printDetails();
//        Principal principal = new Principal("Academy");
//        Staff staff3 = new Staff("Sola",34,"Teacher");
//        Teacher teacher3 = new Teacher("Mr. John", 23, "English");
//        Student student = new Student("Gabriel","Amos", 12, 4);
//        SchoolClass schoolClass1 = new SchoolClass(4,"Jss1A");
//        NonAcademicStaff NonAcademicStaff = new NonAcademicStaff("Mr.John", 45,"burser",45000);
//
//        Principal principal1 = new Principal("Academy");
//        Student student1 = new Student("ola","sola",12,4);
//        principal1.expelStudent(student1, " for stealing ");
//        Teacher teacher2 = new Teacher("Mr. Jay", 45,"English");
//        Course course = new Course("English", teacher);
//        Student student2 = new Student("Cole","Joe",12,4);
//        student.takeCourse(course);
//        School school = new School(principal,teacher,staff,NonAcademicStaff,student,new Course("math",teacher),schoolClass,applicant1);
//        principal1.admitStudent();

        Library library = new Library("School Library");
        library.addBook("English", true);
        library.addBook("math", true);
        library.addBook("agric", true);
        library.addBook("science", true);
        library.addBook("yoruba", true);


        Student juniorStudent = new Student("ola", "dam", 12, 04);
        Student student = new Student("og", "oml", 13, 12);
        Teacher teacher = new Teacher("Mr. Smith", 30, "english");
        Teacher teacher1 = new Teacher("come", 45, "agric");
        library.borrow(teacher,student,juniorStudent,"math");
        library.borrow(teacher,student,juniorStudent,"math");
        library.borrow(null, student, juniorStudent,"agric");













    }
}