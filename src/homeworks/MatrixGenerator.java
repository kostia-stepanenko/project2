package homeworks;

import java.util.Arrays;

// https://curs.upb.ro/2022/pluginfile.php/321351/mod_resource/content/0/HW4_PL.pdf
public class MatrixGenerator {
    public static void main(String[] args) {

        int[][] m = matrix4(5);

        printMatrix(m);

    }

    // column order
    public static int[][] matrix1(int size) {
        if( size < 0 ){
            return new int[0][0];
        }
        int[][] m = new int[size][size];

        int value = 1;

        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                m[row][col] = value++;
            }
        }

        return m;
    }

    // row order
    public static int[][] matrix2(int size) {
        if( size < 0 ){
            return new int[0][0];
        }
        int[][] m = new int[size][size];

        int value = 1;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                m[row][col] = value++;
            }
        }

        return m;
    }

    // zig-zar order
    public static int[][] matrix3(int size) {
        if( size < 0 ){
            return new int[0][0];
        }
        int[][] m = new int[size][size];

        int value = 1;

        for (int row = 0; row < size; row++) {
            if (isEven(row)) {
                for (int col = 0; col < size; col++) {
                    m[row][col] = value++;
                }
            } else {
                for (int col = size - 1; col >= 0; col--) {
                    m[row][col] = value++;
                }
            }
        }

        return m;
    }

    // spiral order
    public static int[][] matrix4(int size) {
        if( size < 0 ){
            return new int[0][0];
        }
        int[][] m = new int[size][size];

        final int matrixLength = m.length;
        int val = 1;

        for (int first = 0; first < matrixLength / 2; ++first) {

            int last = matrixLength - 1 - first;

            // first row left-to-right
            for (int col = first; col < last; ++col) {
                m[first][col]  = val++;
            }

            // last column top-to-down
            for (int row = first; row < last; ++row) {
                m[row][last]  = val++;
            }

            // last row right-to-left
            for (int col = last; col > first; --col) {
               m[last][col] = val++;
            }

            // first column bottom-to-up
            for (int row = last; row > first; --row) {
               m[row][first] = val++;
            }
        }

        // matrix is odd length
        if ((m.length % 2) != 0) {
            int mid = matrixLength / 2;
            m[mid][mid] = val++;
        }
        return m;
    }

    private static void printMatrix(int[][] m) {
        for (int row = 0; row < m.length; row++)
            System.out.println(Arrays.toString(m[row]));
    }

    private static boolean isEven(int val) {
        if (val % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

