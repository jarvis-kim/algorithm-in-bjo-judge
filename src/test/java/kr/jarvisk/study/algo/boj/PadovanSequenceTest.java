package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a9461_PadovanSequence.PadovanSequence;
import org.junit.Assert;
import org.junit.Test;

public class PadovanSequenceTest {

    @Test
    public void test() {
        Assert.assertEquals(3, PadovanSequence.solve(6));
        Assert.assertEquals(16, PadovanSequence.solve(12));
    }
}
