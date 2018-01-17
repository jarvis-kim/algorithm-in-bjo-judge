package kr.jarvisk.study.algo.boj;

import com.google.common.collect.Lists;
import kr.jarvisk.study.algo.boj.a4948_prime_number.ChebyshevTheorem;
import org.junit.Test;

import java.util.Iterator;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class ChebyshevTheoremTest {

    @Test
    public void test() {
        Iterator<Integer> answers = Lists.newArrayList(1, 4, 3, 21, 135, 1033, 8392).iterator();

        Stream.of(1, 10, 13, 100, 1000, 10000, 100000)
                .forEach(number -> assertEquals(answers.next().intValue(), ChebyshevTheorem.solve(number)));
    }
}
