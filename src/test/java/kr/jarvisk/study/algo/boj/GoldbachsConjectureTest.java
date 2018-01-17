package kr.jarvisk.study.algo.boj;

import com.google.common.collect.Lists;
import kr.jarvisk.study.algo.boj.a9020_GoldbachsConjecture.GoldbachsConjecture;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GoldbachsConjectureTest {

    @Test
    public void test() {
        List<Integer> numbers = Lists.newArrayList(8, 10, 16);
        List<GoldbachsConjecture.GoldbachPartition> answers = Lists.newArrayList(
                new GoldbachsConjecture.GoldbachPartition(8, 3, 5),
                new GoldbachsConjecture.GoldbachPartition(10, 5, 5),
                new GoldbachsConjecture.GoldbachPartition(16, 5, 11)
        );

        GoldbachsConjecture.lookup(
                numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt()
        );

        Iterator<GoldbachsConjecture.GoldbachPartition> iterator = answers.iterator();
        numbers.forEach(number -> assertTrue(GoldbachsConjecture.solve(number).equals(iterator.next())));


    }
}
