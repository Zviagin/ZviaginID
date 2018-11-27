package fourth;

import java.util.ArrayList;
import java.util.List;

public class MatrixManager {

    public Matrix createList(int randRange, int rowsCount, int colsCount,String str) {
        Matrix matrix = new Matrix(rowsCount,colsCount,str);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < rowsCount; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < colsCount; j++) {
                list.get(i).add((int) (Math.random() * randRange - randRange / 2));
            }
        }
        matrix.setValues(list);
        return matrix;
    }

    public void displayArray(Matrix matrix) {
        System.out.println("Array:");
        for (List<Integer> anArr : matrix.getValues()) {
            System.out.println(anArr.toString());
        }
    }

    public int sumOfList(Matrix matrix) {
        List<List<Integer>> list = matrix.getValues();
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(0).size(); i++) {
                sum += list.get(j).get(i);
            }
        }
        return sum;
    }

    public int findMaxOfList(Matrix matrix) {
        List<List<Integer>> list = matrix.getValues();
        int maximum = list.get(0).get(0);
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(0).size(); i++) {
                if (list.get(j).get(i) > maximum) {
                    maximum = list.get(j).get(i);
                }
            }
        }
        return maximum;
    }

    public int findMinOfList(Matrix matrix) {
        List<List<Integer>> list = matrix.getValues();
        int minimum = list.get(0).get(0);
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(0).size(); i++) {
                if (list.get(j).get(i) < minimum) {
                    minimum = list.get(j).get(i);
                }
            }
        }
        return minimum;
    }
}
