package com.example.gpacalculator;

public class SpinnerGrades {
    public String id;
    public String grades;

    public SpinnerGrades(String id, String grades) {
        this.id = id;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return grades;
    }
}
