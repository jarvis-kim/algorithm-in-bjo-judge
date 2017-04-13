package kr.jarvisk.study.algo.boj.a11051_BinomialCoefficient2;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 이항계수2
 * https://www.acmicpc.net/problem/11051
 */
public class BinomialCoefficient2 {

    private static int MOD = 10007;

    public static int solve(int n, int k) {
        if ( k < 0 || k > n ) {
            return 0;
        }

        return (factorial(n) / (factorial(k) * factorial(n - k))) % MOD;
    }

    public static int factorial(int number) {
        return IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solve(scanner.nextInt(), scanner.nextInt()));
    }
}
