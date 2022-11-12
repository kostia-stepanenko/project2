package hw6;


import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addExam(int mark) {
        marks.add(mark);
    }

    public int getTotal() {
        int total = 0;
        for (int singleMark : marks) {
            total += singleMark;
        }
        return total;
    }

    public double getMeanMark() {
        int total = getTotal();
        int size = marks.size();

        return (double) total / size;
    }


    public static void main(String[] args) {
        Student s1 = new Student("Mark Davidson");

        s1.addExam(95);
        s1.addExam(75);
        s1.addExam(75);

        System.out.printf("name: %s, total: %d, avg: %.2f\n", s1.getName(), s1.getTotal(), s1.getMeanMark());
    }
}
