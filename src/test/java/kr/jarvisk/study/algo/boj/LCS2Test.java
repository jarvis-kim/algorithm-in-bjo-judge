package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a9252_LCS2.LCS2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCS2Test {

    @Test
    public void test() {
        assertEquals("ACAK", LCS2.solve("ACAYKP".toCharArray(), "CAPCAK".toCharArray()));
    }
}
