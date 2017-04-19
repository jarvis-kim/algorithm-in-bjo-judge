package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a1005_AcmCraft.AcmCraft;
import kr.jarvisk.study.utils.TimeChecker;
import org.junit.Assert;
import org.junit.Test;

public class AcmCraftTest {

    @Test(timeout = 1000)
    public void test() throws InterruptedException {

        long start = System.currentTimeMillis();
        int[] times = new int[ 4 ];
        times[ 0 ] = 10;
        times[ 1 ] = 1;
        times[ 2 ] = 100;
        times[ 3 ] = 10;

        int[][] map = new int[ 4 ][ 4 ];
        map[ 2 - 1 ][ 1 - 1 ] = 1;
        map[ 3 - 1 ][ 1 - 1 ] = 1;
        map[ 4 - 1 ][ 2 - 1 ] = 1;
        map[ 4 - 1 ][ 3 - 1 ] = 1;

        Assert.assertEquals(120, AcmCraft.solve(map, times, 4 - 1));

        times = new int[ 8 ];
        times[ 1 - 1 ] = 10;
        times[ 2 - 1 ] = 20;
        times[ 3 - 1 ] = 1;
        times[ 4 - 1 ] = 5;
        times[ 5 - 1 ] = 8;
        times[ 6 - 1 ] = 7;
        times[ 7 - 1 ] = 1;
        times[ 8 - 1 ] = 43;

        map = new int[ 8 ][ 8 ];
        map[ 2 - 1 ][ 1 - 1 ] = 1;
        map[ 3 - 1 ][ 1 - 1 ] = 1;
        map[ 4 - 1 ][ 2 - 1 ] = 1;
        map[ 5 - 1 ][ 2 - 1 ] = 1;
        map[ 6 - 1 ][ 3 - 1 ] = 1;
        map[ 7 - 1 ][ 5 - 1 ] = 1;
        map[ 7 - 1 ][ 6 - 1 ] = 1;
        map[ 8 - 1 ][ 7 - 1 ] = 1;

        Assert.assertEquals(39, AcmCraft.solve(map, times, 7 - 1));

        long end = System.currentTimeMillis();
        System.out.println(TimeChecker.timeMs(start, end) + " MS");
    }

    @Test
    public void test2() {
        int[] times = new int[ 8 ];
        times[ 1 - 1 ] = 10;
        times[ 2 - 1 ] = 20;
        times[ 3 - 1 ] = 1;
        times[ 4 - 1 ] = 5;
        times[ 5 - 1 ] = 8;
        times[ 6 - 1 ] = 7;
        times[ 7 - 1 ] = 1;
        times[ 8 - 1 ] = 43;

        int[][] map = new int[ 8 ][ 8 ];
        map[ 2 - 1 ][ 1 - 1 ] = 1;
        map[ 3 - 1 ][ 1 - 1 ] = 1;
        map[ 4 - 1 ][ 2 - 1 ] = 1;
        map[ 5 - 1 ][ 2 - 1 ] = 1;
        map[ 6 - 1 ][ 3 - 1 ] = 1;
        map[ 7 - 1 ][ 5 - 1 ] = 1;
        map[ 7 - 1 ][ 6 - 1 ] = 1;
        map[ 8 - 1 ][ 7 - 1 ] = 1;

        Assert.assertEquals(39, AcmCraft.solve(map, times, 7 - 1));
    }
}
