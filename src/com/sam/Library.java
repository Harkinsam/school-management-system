package com.sam;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(String title, boolean available){
        Book book = new Book(title, available);
        books.add(book);
    }



    public void borrow(Teacher teacher, Student seniorStudent,Student juniorStudent, String title) {
        if (teacher != null && teacher.isTeacher()) {
            borrowBook(title, teacher);
        } else if (seniorStudent != null && seniorStudent.isSenior()) {
            borrowBook(title, seniorStudent);
        } else if (juniorStudent != null && juniorStudent.isJunior()) {
            borrowBook(title, juniorStudent);
        } else {
            System.out.println("Invalid request for borrowing.");
        }
    }

    private void borrowBook(String title, Object borrower) {
        Book book = findBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            book.setBorrower(borrower);
            System.out.println(borrower.toString() + " borrowed " + title);
        } else {
            System.out.println("Book \"" + title + "\" is taken.");
        }
    }

    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null; // Book not found
    }


    public class Book {
        private String title;
        private boolean available;
        private Object borrower;

        public Book(String title, boolean available) {

            this.title = title;
            this.available = available;
        }

        public void displayBookInfo() {
            if ((isAvailable())) {
                System.out.println(getTitle() + " is Available");
            } else {
                System.out.println(getTitle() + " is not Available");
            }

        }

        public String getTitle() {
            return title;
        }

        public boolean isAvailable() {
            return available;
        }
        public Object getBorrower() {
            return borrower;
        }

        public void setBorrower(Object borrower) {
            this.borrower = borrower;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
    }
}