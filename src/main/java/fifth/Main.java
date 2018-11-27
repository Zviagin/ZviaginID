package fifth;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createList(50, 4, 4, "Zviagin");
        System.out.println("Created matrix:");
     //   matrixManager.showMatrix(matrix);

        boolean isReadingCorrect = true;
        Matrix readMatrix = null;

        System.out.println();
        try {
            System.out.println("Writing matrix to the file...");
            MatrixWriteRead.write(matrix, "C:\\Users\\Admin\\Documents\\универ\\4 курс\\java\\testToWrite.json");
        } catch (IOException e) {
            System.out.println("Error in writing to file");
            System.out.println(e.getMessage());
        }
        System.out.println();

        try {
            System.out.println("Reading matrix from the file...");
            readMatrix = MatrixWriteRead.read("C:\\Users\\Admin\\Documents\\универ\\4 курс\\java\\testToRead.json");
            System.out.println("Matrix readed from file:");
           // matrixManager.showMatrix(readMatrix);
        } catch (IOException e) {
            System.out.println("Error in reading from file");
            System.out.println(e.getMessage());
            isReadingCorrect = false;
        }
        finally {
            System.out.println("Attempt to write and read matrix.");
        }

        if (isReadingCorrect) {
            System.out.println("The number of columns in the read matrix is " +
                    readMatrix.getColsCount() + " items.");
        }
    }
}

