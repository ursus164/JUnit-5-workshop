package org.tasks.task4;

//Given class represents an GradeBook, which is used to manage subjets and their corresponding grades. Here is what each method does:
//
// addSubject: Adds a new subject to the grade book.
// getSubject: Retrieves the subject object corresponding to the given subject name.
// addNote: Adds a grade (note) to the specified subject. It retrieves the subject object using the getSubject method and adds the note to it.
// getAverageNote: Calculates and returns the average grade across all subjects in the grade book
//
//In package "test/java/org.tasks/task4" you will find a test class with initial tests.
//However, some of them ends in failure. Get familiar with structure, and methods of "GradeBook" and "Subject" classes provided
// in this package and then navigate to corresponding test class in "test/java/org/tasks/task4" for the rest of the task.

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    private Map<String, Subject> subjects = new HashMap<>();

    public void addSubject(String subject) {
        if (subjects.containsKey(subject)) {
            throw new IllegalArgumentException(String.format("Przedmiot  %s juz istnieje!", subject));
        }
        subjects.put(subject, new Subject(subject));
    }

    public Subject getSubject(String subject) {
        if (subjects.containsKey(subject)) {
            return subjects.get(subject);
        }
        throw new IllegalArgumentException(String.format("Przedmiot %s nie istnieje!", subject));
    }

    public void addNote(String subjectName, double note) {
        Subject subject = getSubject(subjectName);
        subject.addNote(note);
    }

    public double getAverageNote() {
        double noteSum = 0;
        for(Subject subject : subjects.values()) {
            noteSum += subject.getAverage();
        }
        return noteSum / subjects.size();
    }
}