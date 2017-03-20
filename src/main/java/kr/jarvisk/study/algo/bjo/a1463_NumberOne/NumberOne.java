package kr.jarvisk.study.algo.bjo.a1463_NumberOne;
/**
 * 1로 만들기
 * https://www.acmicpc.net/problem/1463
 *
 * DP로 품
 */

import java.util.Scanner;

public class NumberOne {


    public static int solve(int n) {
        if ( n <= 3 ) {
            return 1;
        }
        int d[] = new int[ n + 1 ];
        d[ 2 ] = 1;
        d[ 3 ] = 1;
        int min;
        for ( int x = 4; x <= n; x++ ) {
            min = Integer.MAX_VALUE;
            if ( x % 3 == 0 ) {
                min = Math.min(min, d[ x / 3 ] + 1);
            }
            if ( x % 2 == 0 ) {
                min = Math.min(min, d[ x / 2 ] + 1);
            }
            min = Math.min(min, d[ x - 1 ] + 1);
            d[ x ] = min;
        }

        return d[ n ];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(solve(x));
    }

}
