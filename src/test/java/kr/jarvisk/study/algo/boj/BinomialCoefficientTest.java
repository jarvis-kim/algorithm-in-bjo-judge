package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a11050_BinomialCoefficient.BinomialCoefficient;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinomialCoefficientTest {

    @Test
    public void test() {
        assertEquals(10, BinomialCoefficient.solve(5, 2));
    }


}
