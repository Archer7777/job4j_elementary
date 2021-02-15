package ru.job4j.condtition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square1() {
        int expected = 1;
        int p = 4;
        int k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square3() {
        int expected = 2;
        int p = 8;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square4() {
        int expected = 0;
        int p = 5;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}