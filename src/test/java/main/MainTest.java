package main;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Test
    public void test__power() {
        int expectedAnswer = 16;
        int base = 2;
        int power = 4;
        int answer = Main.power(2, 4);
        Assert.assertEquals(answer, expectedAnswer);
    }

    @Test
    public void test__nCr() {
        int expectedAnswer = 10;
        int n = 5;
        int r = 2;
        int answer = Main.nCr(n, r);
        Assert.assertEquals(answer, expectedAnswer);
    }

    @Test
    public void test__gcd() {
        int expectedAnswer = 5;
        int a = 10;
        int b = 15;
        int answer = Main.gcd(a, b);
        Assert.assertEquals(answer, expectedAnswer);
    }
}