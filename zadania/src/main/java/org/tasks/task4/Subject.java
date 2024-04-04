package org.tasks.task4;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private final String name;
    private List<Double> notes = new LinkedList<>();

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNote(double note) {
        notes.add(note);
    }

    public double getAverage() {
        double noteSum = 0;
        for(double note : notes) {
            noteSum += note;
        }
        return noteSum / notes.size();
    }

    public List<Double> getNotes() {
        return notes;
    }
}