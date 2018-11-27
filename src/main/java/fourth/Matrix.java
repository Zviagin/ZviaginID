package fourth;

import java.util.List;
import java.util.ArrayList;

public class Matrix {

    private int rowNum;
    private int colNum;
    private List<List<Integer>> list;
    public String author;


    Matrix(int n, int m,String author) {
        this.setRowNum(n);
        this.setColNum(m);
        this.author = author;
        this.list = list;
}

    public int getColNum() {
        return this.colNum;
    }

    public void setColNum(int colNum) {
        this.colNum = colNum;
    }

    public int getRowNum() {
        return this.rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public List<List<Integer>> getValues() {
        return this.list;
    }

    public void setValues(List<List<Integer>> arr) {
        this.list = arr;
    }

}
