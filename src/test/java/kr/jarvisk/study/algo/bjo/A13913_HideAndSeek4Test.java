package kr.jarvisk.study.algo.bjo;

import kr.jarvisk.study.algo.bjo.a13913_HideAndSeek4.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class A13913_HideAndSeek4Test {

    private final static long LIMIT_TIME = 2 * 1000;

    @Test(timeout = LIMIT_TIME)
    public void test() {
        Main hideAndSeek = new Main();
        int[] result = hideAndSeek.solve(5, 17);
        assertArrayEquals(new int[] { 5, 4, 8, 16, 17 }, result);
        Assert.assertEquals(4, result.length - 1);
    }
}
