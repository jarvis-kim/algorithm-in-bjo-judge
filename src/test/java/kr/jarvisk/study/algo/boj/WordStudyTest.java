package kr.jarvisk.study.algo.boj;

import kr.jarvisk.study.algo.boj.a1157_WordStudy.WordStudy;
import org.junit.Assert;
import org.junit.Test;

public class WordStudyTest {

    @Test
    public void test() {
        Assert.assertEquals('?', WordStudy.solve("Mississipi"));
        Assert.assertEquals('S', WordStudy.solve("Misssissipi"));
        Assert.assertEquals('M', WordStudy.solve("m"));
        Assert.assertEquals('A', WordStudy.solve("mavavavavavavaaa"));
        Assert.assertEquals('M', WordStudy.solve("mmmMc"));
        Assert.assertEquals('?', WordStudy.solve("ab"));

        Assert.assertEquals('?', WordStudy.solve("aaaabbbb"));
        Assert.assertEquals('A', WordStudy.solve("aaaabb"));
        Assert.assertEquals('B', WordStudy.solve("abbbbbb"));
    }
}
