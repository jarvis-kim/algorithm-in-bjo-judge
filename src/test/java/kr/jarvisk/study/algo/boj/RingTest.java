package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a3036_ring.Ring;
import org.junit.Assert;
import org.junit.Test;

public class RingTest {

    @Test
    public void test() {
        Assert.assertArrayEquals(new String[] { "4/1", "3/2", "3/1" }, Ring.solve(12, 3, 8, 4));

    }
}
