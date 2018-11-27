package second;

public class Matrix {
    private int[][] arr;
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

    public int[][] getArr(){
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
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
}
