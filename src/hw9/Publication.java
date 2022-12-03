package hw9;

import java.util.Calendar;

public abstract class Publication {

    private String name;
    private Calendar apparition;
    private int numberOfAuthors;

    public Publication(String name, int numberOfAuthors) {
        this.name = name;
        this.numberOfAuthors = numberOfAuthors;
    }

    public abstract double computeScore();

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }
}
