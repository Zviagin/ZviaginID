package fifth;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Matrix {

    private List<List<Integer>> arr;
    private int rowsCount;
    private int colsCount;
    private int randRange;
    public String author;


    public Matrix(int rowsCount, int colsCount, int randRange) {
        this.rowsCount = rowsCount;
        this.colsCount = colsCount;
        this.randRange = randRange;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public int getColsCount() {
        return colsCount;
    }

    public int getRandRange() {
        return randRange;
    }



    public void setrowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public void setcolsCount(int colsCount) {
        this.colsCount = colsCount;
    }

    public void setrandRange(int randRange) {
        this.randRange = randRange;
    }

    public void setString(String author) {
        this.author = author;
    }


    public List<List<Integer>> getArr() {
        return arr;
    }

    public void setArr(List<List<Integer>> arr) {
        this.arr = arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return rowsCount == matrix.rowsCount &&
                colsCount == matrix.colsCount &&
                randRange == matrix.randRange &&
                Objects.equals(arr, matrix.arr) &&
                Objects.equals(author, matrix.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arr, rowsCount, colsCount, randRange, author);
    }
}

