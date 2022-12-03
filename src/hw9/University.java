package hw9;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name ;
    private String location ;
    private final  List<Author> authors = new ArrayList<>();

    public University(String name,String location){
        this.name =name;
        this.location =location;
    }


    public void addAuthor(Author a){
       authors.add(a);
    }


    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }

    public double computeScore(){
        double sum = 0.0;
        for (Author cur :authors){
            sum += cur.computeScore();

        }
        return sum;
    }
    public static void main(String[] args) {
        Author a1 = new Author("Kostia");
        a1.addPublication(new Journal("publication-1", 2, "Journal title 1", 0.5));
        a1.addPublication(new Journal("publication-2", 2, "Journal title 2", 0.5));
        a1.addPublication(new ConferenceProceeding("publication-3", 7, "volume-123", true));
        a1.addPublication(new ConferenceProceeding("publication-4", 7, "volume-123(2)", true));

        Author a2 = new Author("Max");
        a2.addPublication(new Journal("Max publication-1", 3, "Journal title 3", 0.8));
        a2.addPublication(new Journal("Max publication-2", 3, "Journal title 4", 0.8));
        a2.addPublication(new ConferenceProceeding("Max publication-3", 9, "volume-456", false));
        a2.addPublication(new ConferenceProceeding("Max publication-4", 9, "volume-456(2)", false));

        University univer1 = new University("Upb","Bucharest");
        univer1.addAuthor(a1);
        univer1.addAuthor(a2);


        System.out.printf("Author %s, score: %.2f%n", a1.getName(), a1.computeScore());
        System.out.printf("Author %s, score: %.2f%n", a2.getName(), a2.computeScore());
        System.out.printf("University %s, score: %.2f%n", univer1.name, univer1.computeScore());
    }
}
