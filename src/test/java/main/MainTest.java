package main;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Test
    public void test__power() {
        double expectedAnswer = 16;
        double base = 2;
        double power = 4;
        double answer = Main.power(base, power);
        Assert.assertEquals(answer, expectedAnswer, 0);;
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