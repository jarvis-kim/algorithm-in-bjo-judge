package kr.jarvisk.study.algo.bjo;

import kr.jarvisk.study.algo.bjo.a1463_NumberOne.NumberOne;
import org.junit.Assert;
import org.junit.Test;

public class NumberOneTest {

    @Test()
    public void test() {
        Assert.assertEquals(1, NumberOne.solve(2));
        Assert.assertEquals(3, NumberOne.solve(10));
    }
}
