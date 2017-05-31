package kr.jarvisk.study.algo.boj.A1934_LCM;

/**
 * 최소 공배수
 *
 * https://www.acmicpc.net/problem/1934
 */
public class LCM {

    public static int solve(int a, int b) {
        int aa = a, bb = b;
        int tmp;
        while ( aa % bb != 0 ) {
            tmp = aa;
            aa = bb % aa;
            bb = tmp;
        }

        return a * b / bb;
    }
}
