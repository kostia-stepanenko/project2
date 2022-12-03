package hw9;

public class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String name, int numberOfAuthors, String volumeName, boolean indexed) {
        super(name, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }

    @Override
    public double computeScore() {
        if (indexed) {
            return 0.25 / getNumberOfAuthors();
        }
        return 0.2 / getNumberOfAuthors();

    }
}
