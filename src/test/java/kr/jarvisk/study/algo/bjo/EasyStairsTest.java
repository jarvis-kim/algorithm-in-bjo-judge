package kr.jarvisk.study.algo.bjo;

import kr.jarvisk.study.algo.bjo.a10844_EasyStairs.EasyStairs;
import org.junit.Assert;
import org.junit.Test;

public class EasyStairsTest {

    @Test(timeout = 1000)
    public void test() {
        Assert.assertEquals(9, EasyStairs.solve(1));
        Assert.assertEquals(17, EasyStairs.solve(2));
    }
}
