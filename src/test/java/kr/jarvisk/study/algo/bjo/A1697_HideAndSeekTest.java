package kr.jarvisk.study.algo.bjo;

import kr.jarvisk.study.algo.bjo.a1697_HideAndSeek.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class A1697_HideAndSeekTest {

    private final static long LIMIT_TIME = 2 * 1000;

    @Test(timeout = LIMIT_TIME)
    public void test() {
        Main hideAndSeek = new Main();
        System.out.println(hideAndSeek.solve(5, 11));
//        assertEquals(4, hideAndSeek.solve(5, 17));

    }

    @Test(timeout = LIMIT_TIME)
    public void test2() {
        Main hideAndSeek = new Main();
        assertEquals(18, Main.solve(6, 100000));
    }

}
