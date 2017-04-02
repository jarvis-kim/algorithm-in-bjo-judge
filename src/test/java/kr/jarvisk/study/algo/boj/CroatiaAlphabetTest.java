package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a2941_CroatiaAlphabet.CroatiaAlphabet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CroatiaAlphabetTest {

    @Test
    public void test() {
        assertEquals(6, CroatiaAlphabet.solve("ljes=njak"));
    }
}
