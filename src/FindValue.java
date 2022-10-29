import java.util.Arrays;

public class FindValue {


    public static void main(String args[]) {

        int[] arr1 = {1, 3, 5, 7};


        int value = 7;
        boolean found = find(arr1, value);

        System.out.println(found);
    }
    public static boolean find (int[] arr1, int value) {

        boolean found = false;
        for (int x : arr1) {
            if (x == value) {
                found = true;
                break;


            }

        }
        return found;
    }

}