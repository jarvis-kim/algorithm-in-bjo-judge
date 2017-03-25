package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a2839_Secer.Secer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecerTest {

    @Test
    public void test() {
        assertEquals(1, Secer.solve(3));
        assertEquals(-1, Secer.solve(4));
        assertEquals(2, Secer.solve(6));
        assertEquals(3, Secer.solve(9));
        assertEquals(2, Secer.solve(10));
        assertEquals(1, Secer.solve(3));
        assertEquals(4, Secer.solve(12));
        assertEquals(3, Secer.solve(13));
        assertEquals(3, Secer.solve(15));
        assertEquals(4, Secer.solve(16));
        assertEquals(4, Secer.solve(18));
        Secer.solve(1000);
    }
}
