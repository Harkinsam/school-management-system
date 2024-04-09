package main.java.com.sam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal extends Staff {
        private String department;

        public Principal(String department) {
            super("Mr. Principal", 45, "Principal");
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void admitStudent() throws IOException {
            try(BufferedReader theFile = new BufferedReader(new FileReader("Student_Data.csv"))){
                String line;
                while((line = theFile.readLine()) != null){
                    String replace = line.replaceAll("\"", "");
                    String[] input = replace.split(",");
                    for (int i = 0; i < input.length; i++){
                        System.out.print(input[i]);
                        if (i < input.length -1){
                            System.out.print("|");
                        }
                    }
                    System.out.println();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
//            try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("Student_Data.csv")))) {
//                scanner.useDelimiter("\\|");
//                while(scanner.hasNextLine()){
//                    String input = scanner.nextLine().replaceAll("\"", "");
//                    String[] data = input.split("\\|");
//                    for(int i = 0; i < data.length; i++){
//                        System.out.print(data[i]);
//                        if (i < data.length - 1) {
//                            System.out.print("|"); // Add "|" separator between fields
//                        }
//                    }
//                    System.out.println();
//                }
//            }catch (IOException e){
//                e.printStackTrace();
//            }
        }


        public void expelStudent(Student student, String reason) {
            System.out.println("Expelling student: " + student.getFullName() + " " + reason);
            // Additional logic can be added here
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String department() {
            return department;
        }

        @Override
        public void performResponsibilities() {
            System.out.println(getName() + " is managing " + department + " department");
        }

        public void conductSchoolAssembly() {
            System.out.println(getName() + " is conducting a school assembly.");
        }
    }
