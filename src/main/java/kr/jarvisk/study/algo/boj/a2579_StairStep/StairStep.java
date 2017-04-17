package kr.jarvisk.study.algo.boj.a2579_StairStep;

import java.util.Scanner;

/**
 * 계단 오르기
 * https://www.acmicpc.net/problem/2579
 *
 * 시간 초과...
 */
public class StairStep {

    private final static int MIN = -9999;

    public static int solve(int[] stair, int idx, int jump) {
        if ( idx == 0 ) {
            return stair[ idx ];
        }
        if ( idx < 0 ) {
            return MIN;
        }

        int jump1 = MIN;
        if ( jump != 1 ) {
            jump1 = solve(stair, idx - 1, 1);
        }
        int jump2 = solve(stair, idx - 2, 2);

        return Math.max(jump1, jump2) + stair[ idx ];

//        int[] scores1 = new int[ stair.length ];
//        int[] scores2 = new int[ stair.length ];
//        int[] scores = new int[ stair.length ];
//
//
//        scores1[ 0 ] = stair[ 0 ];
//        scores1[ 1 ] = scores1[ 1 ] + stair[ 1 ];
//
//        int sc1;
//        int sc2;
//        for ( int index = 2; index < stair.length; index++ ) {
//            sc1 = scores1[ index - 1 ];
//            scores[ index ] = Math.max(scores[ index - 1 ], scores[ index - 2 ]);
//        }
//
//        return Math.max(scores1[ stair.length - 1 ], scores2[ stair.length - 2 ]);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputs = new int[ n ];

        for ( int index = 0; index < n; index++ ) {
            inputs[ index ] = scanner.nextInt();
        }

        System.out.println(solve(inputs, n - 1, 0));
    }
}

