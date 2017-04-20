package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a10844_StairCount.StairCount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StairCountTest {

    @Test
    public void test() {
        assertEquals(9, StairCount.solve(1));
        assertEquals(17, StairCount.solve(2));
    }
}
