package hw9;

public class Journal extends Publication {
    private String journalName;
    private double impactFactor;

    public Journal(String name, int numberOfAuthors, String journalName, double impactFactor) {
        super(name, numberOfAuthors);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }

    @Override
    public double computeScore() {
        return (impactFactor * 0.5) / getNumberOfAuthors();
    }
}
