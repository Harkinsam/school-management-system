package test.java;

import main.java.com.sam.Library;
import main.java.com.sam.Library.Book;
import main.java.com.sam.Student;
import main.java.com.sam.Teacher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;
    private Teacher teacher;
    private Student seniorStudent;
    private Student juniorStudent;
    private Book book;

    @Before
    public void setUp() {
        library = new Library("Test Library");
        teacher = new Teacher("John Doe", 40, "english");
        seniorStudent = new Student("Alice", "Smith", 16,7);
        juniorStudent = new Student("Bob", "Johnson",11,3);
    }


    @Test
    public void testBorrowWithTeacher() {
        library.addBook("Book1", true);
        library.borrow(teacher, null, null, "Book1");
        Object borrower = library.getBorrowedBook("Book1");
        assertNotNull(teacher);
        assertEquals(teacher,borrower);
    }

    @Test
    public void testBorrowWithSeniorStudent() {
        library.addBook("Book2", true);
        library.borrow(null, seniorStudent, null, "Book2");
        Object borrower = library.getBorrowedBook("Book2");
        assertNotNull(seniorStudent);
        assertEquals(seniorStudent,borrower);
        assertFalse("Book2", library.isvailable("Book2"));
    }

    @Test
    public void testBorrowWithJuniorStudent() {
        library.addBook("Book3", true);
        library.borrow(null, null, juniorStudent, "Book3");
        Object borrower = library.getBorrowedBook("Book3");
        assertNotNull(juniorStudent);
        assertEquals(juniorStudent,borrower);
        assertFalse("Book3", library.isvailable("Book3"));

    }

    @Test
    public void testBorrowInvalidBorrower() {
        library.addBook("Book4", true);
        library.borrow(null, null, null, "Book4");
        assertTrue("Book4", library.isvailable("Book4"));
    }
}
