package second;

public class Main {
    public static void main(String[] args){

        MatrixManager matrix_man = new MatrixManager();
        Matrix matrix = matrix_man.createMatrix(50,6, 4,"Zviagin");
        matrix_man.showMatrix(matrix);

        System.out.println("Rows count of my array: " + matrix.getRowsCount());
        System.out.println("Cols count of my array: " + matrix.getColsCount());
        System.out.println("Range of my array: " + matrix.getRandRange());
        System.out.println("Sum of my array: " + matrix_man.sumOfArray(matrix));
        System.out.println("Max of my array: " + matrix_man.findMaxOfArray(matrix));
        System.out.println("Min of my array: " + matrix_man.findMinOfArray(matrix));
    }
}
