package fourth;

public class Main {

    public static void main(String[] args) {

        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createList(50, 4, 4,"Zviagin");
        matrixManager.displayArray(matrix);

        System.out.println("Sum of array: " + matrixManager.sumOfList(matrix));

        System.out.println("Max of array: " + matrixManager.findMaxOfList(matrix));

        System.out.println("Min of array: " + matrixManager.findMinOfList(matrix));

    }

}
