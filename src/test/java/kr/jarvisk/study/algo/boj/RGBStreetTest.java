package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a1149_RGBStreet.RGBStreet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RGBStreetTest {

    @Test
    public void test() {

        int[][] inputs = new int[][] {
                new int[] { 26, 40, 83 },
                new int[] { 49, 60, 57 },
                new int[] { 13, 89, 99 }
        };

        assertEquals(96, RGBStreet.solve(inputs));
    }
}
