package kr.jarvisk.study.algo.boj;

        import kr.jarvisk.study.algo.boj.a2579_StairStep.StairStep;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

public class StairStepTest {

    @Test
    public void test() {

        assertEquals(75, StairStep.solve(new int[] {10, 20, 15, 25, 10, 20}, 5, 0));
        assertEquals(96, StairStep.solve(new int[] {13, 1, 15, 27, 29, 21, 20}, 6, 0 ));
        assertEquals(3, StairStep.solve(new int[] {1, 1, 0, 0, 1, 1}, 5, 0));
        assertEquals(4, StairStep.solve(new int[] {1, 1, 0, 1, 1}, 4, 0));
        assertEquals(116, StairStep.solve(new int[] {1, 10, 10, 3, 5, 100}, 5, 0));

    }
}