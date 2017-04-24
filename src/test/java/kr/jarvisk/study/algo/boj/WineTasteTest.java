package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a2516_WineTaste.WineTaste;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WineTasteTest {

    @Test
    public void test() {
        assertEquals(33, WineTaste.solve(6, 10, 13, 9, 8, 1));
//        assertEquals(40, WineTaste.solve(4, 5, 1, 1, 16, 15));
        assertEquals(4000, WineTaste.solve(1000, 1000, 1, 1, 1000, 1000));
    }

    @Test
    public void testRecursive() {
        assertEquals(23, WineTaste.solveWineTaste(2, 0));
        assertEquals(33, WineTaste.solveWineTaste(5, 0));
        assertEquals(40, WineTaste.solveWineTaste(5, 0));
        assertEquals(4000, WineTaste.solveWineTaste(5, 0));
    }
}