package hw9;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private final List<Publication> publications = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addPublication(Publication p){
        publications.add(p);
    }

    public String getName() {
        return name;
    }

    public double computeScore(){

        double sum = 0.0;
        for (Publication cur :publications){
            sum += cur.computeScore();

        }
        return sum;
    }

}
