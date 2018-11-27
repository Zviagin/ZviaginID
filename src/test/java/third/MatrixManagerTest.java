package third;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;


public class MatrixManagerTest {
    private static MatrixManager matrix_man = new MatrixManager();
    private static Matrix matrix = matrix_man.createMatrix(10, 3, 3,"Zviagin");
    private static int[][] testMatrix = {{2, 3, 2}, {3, 8, 7}, {6, 5, 1}};

    @Before
    public void init() {
        matrix.setArr(testMatrix);
    }

    @Test
    public void sumOfArray() {
        assertEquals("Test sum of array", 37, matrix_man.sumOfArray(matrix));
    }

    @Test
    public void findMaxOfArray() {
        int actual = matrix_man.findMaxOfArray(matrix);
        int expected = 8;
        assertEquals("Test max of array", expected, actual);
    }

    @Test
    public void findMinOfArray() {
        int actual = matrix_man.findMinOfArray(matrix);
        int expected = 1;
        assertEquals("Test min of array", expected, actual);
    }
}