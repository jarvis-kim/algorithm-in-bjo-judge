package kr.jarvisk.study.algo.bjo;

import kr.jarvisk.study.algo.bjo.a9019_DSLR.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A9019_DSLR {

    private static final int TIME_OUT = 6 * 1000;

    @Test(timeout = TIME_OUT)
    public void test() {
        assertEquals("LL", new Main().solve(1234, 3412));
        assertEquals("L", new Main().solve(1000, 1));
        assertEquals("DDDD", new Main().solve(1, 16));
        assertEquals("", new Main().solve(16, 16));
        assertEquals("S", new Main().solve(0, 9999));
    }
}
