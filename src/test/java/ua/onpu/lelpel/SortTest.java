package ua.onpu.lelpel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    private Task task;

    @Before
    public void setUp() throws Exception {
         task = new Task();
    }

    @After
    public void tearDown() throws Exception {
        task = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGivenNullMatrix_throwIllegalArgException() {
        task.sort(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGivenEmptyMatrix_throwIllegalArgException() {
        task.sort(new int[0][0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenGivenTooSmallMatrix_throwIllegalArgException() {
        task.sort(new int[1][1]);
    }

    @Test
    public void whenGivenMatrix_sortOddColumns() {
        int[][] mtx = {{1, 4, 6, 0}, {10, 6, 1, 1}, {7, 3, 4, 0}, {5, 6, 7, 8}, {3, 4, 8, 5}};
        int[][] expected = {{1, 6, 6, 8 }, {10, 6, 1, 5 }, {7, 4, 4, 1}, {5, 4, 7, 0}, {3, 3, 8, 0}};
        int[][] res = task.sort(mtx);
        assertArrayEquals(expected, res);
    }

    @Test
    public void whenGivenDescSortedMatrix_sortOddColumns() {
        int[][] mtx = {{1, 6, 6, 8 }, {10, 6, 1, 5 }, {7, 4, 4, 1}, {5, 4, 7, 0}, {3, 3, 8, 0}};
        int[][] expected = {{1, 6, 6, 8 }, {10, 6, 1, 5 }, {7, 4, 4, 1}, {5, 4, 7, 0}, {3, 3, 8, 0}};
        int[][] res = task.sort(mtx);
        assertArrayEquals(expected, res);
    }


    @Test
    public void whenGivenAscSortedMatrix_sortOddColumns() {
        int[][] mtx = {{1, 3, 6, 0}, {10, 4, 1, 0}, {7, 4, 4, 1}, {5, 6, 7, 5}, {3, 6, 8, 8}};
        int[][] expected = {{1, 6, 6, 8 }, {10, 6, 1, 5 }, {7, 4, 4, 1}, {5, 4, 7, 0}, {3, 3, 8, 0}};
        int[][] res = task.sort(mtx);
        assertArrayEquals(expected, res);
    }
}
