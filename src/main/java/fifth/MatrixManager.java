package fifth;

import fourth.Matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixManager {

    public fifth.Matrix createList(int randRange, int rowsCount, int colsCount, String str) {
        fifth.Matrix matrix = new fifth.Matrix(rowsCount,colsCount,randRange);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < rowsCount; i++) {
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < colsCount; j++) {
                list.get(i).add((int) (Math.random() * randRange - randRange / 2));
            }
        }
        matrix.setArr(list);
        return matrix;
    }

}
