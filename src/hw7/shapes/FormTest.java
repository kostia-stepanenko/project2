package hw7.shapes;

public class FormTest {

    public static void main(String[] args) {

        Form[] arr = {
                new Point(1, 2),
                new Circle(10, 1, 2),
                new Cylinder(10, 5, 1, 0)
        };

        for(Form cur : arr){
            System.out.println(cur);
            System.out.printf("area: %.2f, volume: %.2f\n\n", cur.computeArea(), cur.computeVolume());
        }

    }
}
