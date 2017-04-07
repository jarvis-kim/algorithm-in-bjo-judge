package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a2775_Apartment.Apartment;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApartmentTest {

    @Test
    public void test() {
        assertEquals(6, Apartment.solve(1, 3));
        assertEquals(10, Apartment.solve(2, 3));
    }
}
