package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a1475_RoomNumber.RoomNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomNumberTest {

    @Test
    public void test() {
        assertEquals(2, RoomNumber.solve(9999));
        assertEquals(1, RoomNumber.solve(1234));
        assertEquals(2, RoomNumber.solve(6669));
        assertEquals(3, RoomNumber.solve(1232369969));
    }


}
