package second;

import java.util.Arrays;

public class MatrixManager {

    public Matrix createMatrix(int randRange, int rowsCount, int colsCount, String author) {
        int rand;
        Matrix matrix = new Matrix(rowsCount, colsCount, randRange);
        int[][] arr = new int[rowsCount][colsCount];
        matrix.setArr(arr);
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < colsCount; j++) {
                rand = (int) (Math.random() * randRange - randRange / 2);
                arr[i][j] = rand;
            }
        }
        return matrix;
    }

    public void showMatrix(Matrix matrix) {
        int[][] arr = matrix.getArr();
        for (int i = 0; i < matrix.getColsCount(); i++) {
            for (int j = 0; j < matrix.getColsCount(); j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int sumOfArray(Matrix matrix) {
        int[][] arr = matrix.getArr();
        int sum = 0;
        for (int j = 0; j < matrix.getColsCount(); j++) {
            for (int i = 0; i < matrix.getColsCount(); i++) {
                sum += arr[j][i];
            }
        }
        return sum;
    }

    public int findMaxOfArray(Matrix matrix) {
        int[][] arr = matrix.getArr();
        int maximum = arr[0][0];
        for (int j = 0; j <  matrix.getColsCount(); j++) {
            for (int i = 1; i <matrix.getColsCount(); i++) {
                if (arr[j][i] > maximum) {
                    maximum = arr[j][i];
                }
            }
        }
        return maximum;
    }

    public int findMinOfArray(Matrix matrix) {
        int[][] arr = matrix.getArr();
        int minimum = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr[j].length; i++) {
                if (arr[j][i] < minimum) {
                    minimum = arr[j][i];
                }
            }
        }
        return minimum;
    }

}

