package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.A1934_LCM.LCM;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCMTest {

    @Test
    public void test() {
        assertEquals(45000, LCM.solve(1, 45000));
        assertEquals(30, LCM.solve(6, 10));
        assertEquals(30, LCM.solve(10, 6));
        assertEquals(221, LCM.solve(13, 17));
    }
}
