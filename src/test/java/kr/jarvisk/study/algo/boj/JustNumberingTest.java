package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a2667_JustNumbering.JustNumbering;
import org.junit.Assert;
import org.junit.Test;

public class JustNumberingTest {

    @Test
    public void test() {
        int[][] map = new int[][] {
                new int[] { 0, 1, 1, 0, 1, 0, 0 },
                new int[] { 0, 1, 1, 0, 1, 0, 1 },
                new int[] { 1, 1, 1, 0, 1, 0, 1 },
                new int[] { 0, 0, 0, 0, 1, 1, 1 },
                new int[] { 0, 1, 0, 0, 0, 0, 0 },
                new int[] { 0, 1, 1, 1, 1, 1, 0 },
                new int[] { 0, 1, 1, 1, 0, 0, 0 },
        };

        Assert.assertArrayEquals(new int[] { 7, 8, 9 }, JustNumbering.solve(map));
    }
}
