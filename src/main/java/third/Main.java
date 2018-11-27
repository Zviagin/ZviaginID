package third;

public class Main {
    public static void main(String[] args){

        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createMatrix(50,6, 4,"Zviagin");
        matrixManager.showMatrix(matrix);

        System.out.println("Rows count of my array: " + matrix.getRowsCount());
        System.out.println("Cols count of my array: " + matrix.getColsCount());
        System.out.println("Range of my array: " + matrix.getRandRange());
        System.out.println("Sum of my array: " + matrixManager.sumOfArray(matrix));
        System.out.println("Max of my array: " + matrixManager.findMaxOfArray(matrix));
        System.out.println("Min of my array: " + matrixManager.findMinOfArray(matrix));
    }
}
