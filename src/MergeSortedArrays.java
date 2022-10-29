import java.util.Arrays;

public class MergeSortedArrays {


    public static void main(String args[]) {

        int arr1[] = {1, 3, 5, 7};

        int arr2[] = {2, 4, 6, 8};

        int arr3[] = new int[arr1.length + arr2.length];

        mergeArrays(arr1, arr2, arr3);

        System.out.println("Array after merging");
        System.out.println(Arrays.toString(arr3));
    }

    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        Arrays.sort(arr3);

    }

}

