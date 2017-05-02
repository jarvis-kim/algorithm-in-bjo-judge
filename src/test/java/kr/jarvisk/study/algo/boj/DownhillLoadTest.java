package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a1502_DownhillLoad.DownhillLoad;
import org.junit.Assert;
import org.junit.Test;

public class DownhillLoadTest {

    @Test
    public void test() {
        int n = 4;
        int m = 5;

        int[][] map = new int[][] {
                new int[] { 50, 45, 37, 32, 30 },
                new int[] { 35, 50, 40, 20, 25 },
                new int[] { 30, 30, 25, 17, 28 },
                new int[] { 27, 24, 22, 15, 10 },
        };
        Assert.assertEquals(3, new DownhillLoad(map).solve(n - 1, m - 1));
    }

    @Test
    public void test2() {
        int n = 1;
        int m = 1;

        int[][] map = new int[][] {
                new int[] { 50 },
        };
        Assert.assertEquals(1, new DownhillLoad(map).solve(n - 1, m - 1));
    }

    @Test
    public void test3() {
        int n = 4;
        int m = 5;

        int[][] map = new int[][] {
                new int[] { 50, 45, 37, 32, 30 },
                new int[] { 35, 50, 40, 20, 28 },
                new int[] { 30, 30, 25, 17, 27 },
                new int[] { 27, 24, 22, 15, 10 },
        };
        Assert.assertEquals(5, new DownhillLoad(map).solve(n - 1, m - 1));
    }
}
