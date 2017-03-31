package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a2675_RepeatString.RepeatString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatStringTest {

    @Test
    public void test() {
        assertEquals("AAABBBCCC", RepeatString.solve(3, "ABC"));
        assertEquals("/////HHHHHTTTTTPPPPP", RepeatString.solve(5, "/HTP"));
    }
}
