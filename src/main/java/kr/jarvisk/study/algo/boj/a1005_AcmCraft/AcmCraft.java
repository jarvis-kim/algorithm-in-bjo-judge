package kr.jarvisk.study.algo.boj.a1005_AcmCraft;

import java.util.Scanner;

/**
 * ACM Craft
 * https://www.acmicpc.net/problem/1005
 *
 * max(m[ W ][ ]) + time = W를 건물을 짓는 최소 시간
 *
 * 시간초과.... 뭐지..재귀 호출하면 너무 느린가..
 *
 */
public class AcmCraft {

    public static int solve(int[][] map, int[] times, int w) {
        int max = 0;
        for ( int index = 0; index < map[ w ].length; index++ ) {
            if ( map[ w ][ index ] > 0 ) {
                int result = solve(map, times, index);
                max = Math.max(result, max);
            }
        }

        return max + times[ w ];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCount = scanner.nextInt();

        for ( int i = 0; i < testCount; i++ ) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] times = new int[ n ];
            int[][] map = new int[ n ][ n ];

            for ( int timeIndex = 0; timeIndex < times.length; timeIndex++ ) {
                times[ timeIndex ] = scanner.nextInt();
            }

            int a, b;
            for ( int kIndex = 0; kIndex < k; kIndex++ ) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                map[ b - 1 ][ a - 1 ] = 1;
            }
            int w = scanner.nextInt();
            w--;
            System.out.println(solve(map, times, w));
        }
    }

}
