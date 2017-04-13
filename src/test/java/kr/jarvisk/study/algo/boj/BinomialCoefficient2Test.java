package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a11051_BinomialCoefficient2.BinomialCoefficient2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinomialCoefficient2Test {

    @Test
    public void test() {
        assertEquals(10, BinomialCoefficient2.solve(5, 2));
    }
}
