package homeworks;

import java.util.Arrays;

public class MatrixCalculations {

    public static void main(String[] args) {

//        int[][] m = {
//                {1, 2, 3, 4},
//                {12, 13, 14, 5},
//                {11, 16, 15, 6},
//                {10, 9, 8, 7}
//        };

//        System.out.println(sumMainDiagonal(m));
//        System.out.println(sumUnderMainDiagonal(m));

        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        int[][] res = matrixMultiplication(a, b);
        if(res != null ) {
            printMatrix(res);
        }
    }

    public static int sumMainDiagonal(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];

        }

        return sum;
    }

    public static int sumUnderMainDiagonal(int[][] m) {
        int sum = 0;


        for (int row = 0; row < m.length; row++) {

            for (int col = 0; col <= row; col++) {
                sum += m[row][col];
            }

        }
        return sum;
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        if (a.length != b.length) {
            System.err.println("Error for matrix multiplication");
            return null;
        }
        
        int size = a.length;
        int[][] res = new int[size][size];

        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                for(int k = 0; k < size; k++){
                    res[row][col] += a[row][k] * b[k][col];
                }
            }
        }

        return res;
    }

    private static void printMatrix(int[][] m) {
        for (int row = 0; row < m.length; row++)
            System.out.println(Arrays.toString(m[row]));
    }

}

