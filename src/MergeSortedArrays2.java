import java.util.Arrays;

public class MergeSortedArrays2 {


    public static void main(String args[]) {

        int arr1[] = {1, 3, 5, 7};

        int arr2[] = {2, 4, 6, 8};


        int[] arr3 = mergeArrays(arr1, arr2);

        System.out.println("Array after merging");
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0;
        for (int x : arr1) {
            arr3[k++] = x;
        }

        for (int x : arr2) {
            arr3[k++] = x;
        }

        Arrays.sort(arr3);
        return arr3;

    }

}

