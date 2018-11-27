package fifth;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class MatrixWriteReadTest {


    private Matrix matrix = new MatrixManager().createList(10, 3, 3,"1");

    @Test
    public void readWrite() throws IOException {
        MatrixWriteRead.write(matrix, "C:\\Users\\Admin\\Documents\\универ\\testForTest.json");
        Matrix readMatrix = MatrixWriteRead.read("C:\\Users\\Admin\\Documents\\универ\\testForTest.json");

        assertEquals(matrix, readMatrix);
    }


    @Test
    public void writeException() throws IOException {
        MatrixWriteRead.write(matrix, "C:\\Users\\Admin\\Documents\\универ\\testForTest.json");
    }
    @Test
    public void readException() throws IOException {
        Matrix readMatrix = MatrixWriteRead.read("C:\\Users\\Admin\\Documents\\универ\\testForTest.json");
       // MatrixManager.showMatrix(readMatrix);
    }
}