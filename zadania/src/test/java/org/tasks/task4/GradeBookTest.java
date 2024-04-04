package org.tasks.task4;

// Here we have the basic set of tests for the GradeBook class.
// Your goal is to refactor the tests that raise exceptions. For this purpose,
// the executable function interface will be helpful to make the test green - check in the

//

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeBookTest {
    private GradeBook gradeBook;

    @BeforeEach
    void setUp() {
        gradeBook = new GradeBook();
    }

    @Test
    void addSubject_ThrowsIllegalArgumentException_IfSubjectAlreadyExists() {
        gradeBook.addSubject("Math");
        gradeBook.addSubject("Math"); //wywala blad

        // Using executable function interface may be helpful to do this task
        //Executable executable = () -> gradeBook.addSubject("Math");

    }

    @Test
    void getSubject_ThrowsIllegalArgumentException_IfSubjectDoesNotExist() {
        // Tutaj używamy interfejsu funkcyjnego Executable do sprawdzenia, czy pobranie nieistniejącego przedmiotu rzuci wyjątek IllegalArgumentException
        //Executable executable = () -> gradeBook.getSubject("NonExistingSubject");
        gradeBook.getSubject("Math");
        gradeBook.getSubject("idk");
        //assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void addNote_AddsNoteToSubject() {
        gradeBook.addSubject("Physics");
        gradeBook.addNote("Physics", 4.5);

        // Tutaj możemy użyć różnych asercji, np. sprawdzenie, czy ocena została poprawnie dodana do przedmiotu
        assertThat(gradeBook.getSubject("Physics").getNotes().size(), equalTo(1));
        assertThat(gradeBook.getSubject("Physics").getNotes().get(0), equalTo(4.5));


    }

    @Test
    void getAverageNote_ReturnsAverageOfAllSubjects() {
        gradeBook.addSubject("Math");
        gradeBook.addSubject("Physics");

        // Dodajemy oceny dla przedmiotów
        gradeBook.addNote("Math", 4.0);
        gradeBook.addNote("Math", 3.5);
        gradeBook.addNote("Physics", 3.0);

        // Sprawdzamy, czy średnia ocen wszystkich przedmiotów jest poprawnie obliczana
        assertEquals(3.375, gradeBook.getAverageNote());
    }
}
