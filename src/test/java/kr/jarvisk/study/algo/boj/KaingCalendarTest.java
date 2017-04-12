package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a6064_KaingCalendar.KaingCalendar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaingCalendarTest {

    @Test
    public void test() {
        assertEquals(13, KaingCalendar.solve(10, 12, 3, 1));
        assertEquals(33, KaingCalendar.solve(10, 12, 3, 9));
        assertEquals(-1, KaingCalendar.solve(10, 12, 7, 2));
        assertEquals(83, KaingCalendar.solve(13, 11, 5, 6));
        assertEquals(1, KaingCalendar.solve(1, 1, 1, 1));
    }


}
