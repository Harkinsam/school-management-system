package test.java;

import main.java.com.sam.Library;
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
        assertFalse(library.findBookByTitle("Book1").isAvailable());
        assertEquals(teacher, library.findBookByTitle("Book1").getBorrower());
    }

    @Test
    public void testBorrowWithSeniorStudent() {
        library.addBook("Book2", true);
        library.borrow(null, seniorStudent, null, "Book2");
        assertFalse(library.findBookByTitle("Book2").isAvailable());
        assertEquals(seniorStudent, library.findBookByTitle("Book2").getBorrower());
    }

    @Test
    public void testBorrowWithJuniorStudent() {
        library.addBook("Book3", true);
        library.borrow(null, null, juniorStudent, "Book3");
        assertFalse(library.findBookByTitle("Book3").isAvailable());
        assertEquals(juniorStudent, library.findBookByTitle("Book3").getBorrower());
    }

    @Test
    public void testBorrowInvalidBorrower() {
        library.addBook("Book4", true);
        library.borrow(null, null, null, "Book4");
        assertTrue(library.findBookByTitle("Book4").isAvailable());
    }
}
