import java.util.Arrays;

public class MergeSortedArrays3 {


    public static void main(String args[]) {

        int arr1[] = {1, 3, 5, 7, 12, 59, 68};

        int arr2[] = {4, 6, 8, 14, 34};


        int[] arr3 = mergeArrays(arr1, arr2);

        System.out.println("Array after merging");
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];
        int k = 0, i = 0, j = 0;

        while (k < arr3.length) {

            if (i >= arr1.length) {
                arr3[k++] = arr2[j++];
            } else if (j >= arr2.length) {
                arr3[k++] = arr1[i++];
            } else if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }


        return arr3;

    }

}

