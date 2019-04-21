package ua.onpu.lelpel;

import java.util.Arrays;

class Task {
    int[][] sortAndSwap(int[][] matrix) {
        return swap(sort(matrix));
    }

    private void checkNotNull(int[][] mtx) {
        if (mtx == null) {
            throw new IllegalArgumentException("Matrix argument is null");
        }
    }

    private void checkNotEmpty(int[][] mtx) {
        if (mtx.length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }
    }

    private void checkNotTooSmall(int[][] mtx) {
        if (mtx[0].length < 2) {
            throw new IllegalArgumentException("Matrix should have at least two columns");
        }
    }
    int[][] sort(int[][] mtx) throws IllegalArgumentException {
        checkNotNull(mtx);
        checkNotEmpty(mtx);
        checkNotTooSmall(mtx);

        int[][] matrix = Arrays.copyOf(mtx, mtx.length);

        for (int k = 1; k < matrix[0].length; k += 2) {
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = i + 1; j < matrix.length; ++j) {
                    if (matrix[i][k] < matrix[j][k]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[j][k];
                        matrix[j][k] = temp;
                    }
                }
            }
        }

        return matrix;
    }

    int[][] swap(int[][] mtx) throws IllegalArgumentException {
        checkNotNull(mtx);
        checkNotEmpty(mtx);
        checkNotTooSmall(mtx);

        int[][] matrix = Arrays.copyOf(mtx, mtx.length);
        int lastColIdx = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][lastColIdx - 1];
            matrix[i][lastColIdx - 1] = temp;
        }

        return matrix;
    }

    void printMatrix(int[][] matrix) {
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } else if (matrix == null) {
            throw new IllegalArgumentException("arguments of f() are null");
        }
    }
}
