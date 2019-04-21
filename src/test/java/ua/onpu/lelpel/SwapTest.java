package ua.onpu.lelpel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapTest {
    private Task task;

    @Before
    public void setUp() {
        task = new Task();
    }

    @After
    public void tearDown() {
        task = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGivenNullMatrix_throwIllegalArgException() {
        task.swap(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGivenEmptyMatrix_throwIllegalArgException() {
        task.swap(new int[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGivenTooSmallMatrix_throwIllegalArgException() {
        task.swap(new int[1][1]);
    }

    @Test
    public void whenGivenCorrectMatrix_swapFirstAndLastColumn() {
        int[][] mtx = {{1, 4, 6, 0}, {10, 6, 1, 1}, {7, 3, 4, 0}, {5, 6, 7, 8}, {3, 4, 8, 5}};
        int[][] expected = {{0, 4, 6, 1}, {1, 6, 1, 10 }, {0, 3, 4, 7 }, {8, 6, 7, 5}, {5, 4, 8, 3 }};
        int[][] res = task.swap(mtx);
        assertArrayEquals(expected, res);
    }
}
