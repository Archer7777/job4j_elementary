package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSerlectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortOfThree() {
        int[] data = new int[] {2, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortOfFive() {
        int[] data = new int[] {7, 8, 5, 6, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}