package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a2293_Coin1.Coin1;
import org.junit.Assert;
import org.junit.Test;

public class Coin1Test {

    @Test
    public void test() {
        Assert.assertEquals(10, Coin1.solve(10, 1, 2, 5));
    }
}
