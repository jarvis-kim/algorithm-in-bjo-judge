package kr.jarvisk.study.algo.bjo;

import kr.jarvisk.study.algo.bjo.a11726_Tiling.Tiling;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TilingTest {

    @Test
    public void test() {

        assertEquals(2, Tiling.solve(2));
        assertEquals(55, Tiling.solve(9));
    }
}
