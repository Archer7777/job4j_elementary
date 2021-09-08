package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 360;
        int expected = 6;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 730;
        int expected = 53290;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void euroToDollar() {
        int in = 120;
        int expected = 240;
        int out = Converter.euroToDollar(in);
        Assert.assertEquals(expected, out);
    }
}