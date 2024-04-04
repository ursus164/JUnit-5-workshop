package org.tasks.task4;

// Here we have the basic set of tests for the GradeBook class.
// Your goal is to refactor the tests that raise exceptions. For this purpose,
// the executable function interface will be helpful to make the test green - check the documentation
// for usage of this interface in the assertions.


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import javax.security.auth.Subject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeBookTest {
    private GradeBook gradeBook;

    @BeforeEach
    void setUp() {
        gradeBook = new GradeBook();
    }

    @Test
    void addSubject_ThrowsIllegalArgumentException_IfSubjectAlreadyExists() {
        gradeBook.addSubject("Math");

        // Using executable function interface may be helpful to do this task
        //Executable executable = () -> gradeBook.addSubject("Math");
    }

    @Test
    void getSubject_ThrowsIllegalArgumentException_IfSubjectDoesNotExist() {
        // Tutaj używamy interfejsu funkcyjnego Executable do sprawdzenia, czy pobranie nieistniejącego przedmiotu rzuci wyjątek IllegalArgumentException
         gradeBook.getSubject("Physics");
        Executable executable = () -> gradeBook.getSubject("NonExistingSubject");
    }

    @Test
    void addNote_AddsNoteToSubject() {
        gradeBook.addSubject("Physics");
        gradeBook.addNote("Physics", 4.5);

        assertThat(gradeBook.getSubject("Physics").getNotes().size(), equalTo(1));
        assertThat(gradeBook.getSubject("Physics").getNotes().get(0), equalTo(4.5));
    }

    @Test
    void getAverageNote_ReturnsAverageOfAllSubjects() {
        gradeBook.addSubject("Math");
        gradeBook.addSubject("Physics");

        gradeBook.addNote("Math", 4.0);
        gradeBook.addNote("Math", 3.5);
        gradeBook.addNote("Physics", 3.0);

        assertEquals(3.375, gradeBook.getAverageNote());
    }
}
