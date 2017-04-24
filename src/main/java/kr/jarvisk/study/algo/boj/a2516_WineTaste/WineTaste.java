package kr.jarvisk.study.algo.boj.a2516_WineTaste;

import java.util.Scanner;

/**
 * 포도주 시식
 * https://www.acmicpc.net/problem/2156
 * <p>
 * max(d(i - 1) + w[ i ], d(i - 1)) = 포도주를 마시는 최대의 양
 */
public class WineTaste {

    public static int solve(int... wines) {
        int n = wines.length;

        int[][] sums = new int[ n ][ 2 ];
        int[][] choiceCount = new int[ wines.length ][ 2 ];

        sums[ 0 ][ 1 ] = wines[ 0 ];
        choiceCount[ 0 ][ 1 ] = 1;

        if ( n == 1 ) {
            return sums[ 0 ][ 1 ];
        }

        sums[ 1 ][ 0 ] = wines[ 1 ];
        choiceCount[ 1 ][ 0 ] = 1;
        sums[ 1 ][ 1 ] = sums[ 0 ][ 1 ] + wines[ 1 ];
        choiceCount[ 1 ][ 1 ] = 2;

        int a, b;
        for ( int i = 2; i < n; i++ ) {
            sums[ i ][ 0 ] = Math.max(sums[ i - 2 ][ 0 ], sums[ i - 2 ][ 1 ]) + wines[ i ];

            a = sums[ i - 1 ][ 0 ] + wines[ i ];
            choiceCount[ i ][ 0 ] = 1;
            b = sums[ i - 1 ][ 1 ];

            choiceCount[ i ][ 1 ] = 1;

            if ( choiceCount[ i - 1 ][ 1 ] != 2 ) {
                b += wines[ i ];
            }
            sums[ i ][ 1 ] = Math.max(a, b);
            if ( a > b ) {
                choiceCount[ i ][ 1 ]++;
            }
        }

        return Math.max(sums[ n - 1 ][ 0 ], sums[ n - 1 ][ 1 ]);
    }


    private int[] wines;

    private int[][] memoization;

    public WineTaste(int... wines) {
        this.wines = wines;
        memoization = new int[ wines.length ][ 3 ];
    }

    public int solveWineTaste(int index, int jump) {
        if ( jump == 2 ) {
            if ( index - 1 < 0 ) {
                return 0;
            }

            if ( memoization[ index - 1 ][ 2 ] != 0 ) {
                return memoization[ index - 1 ][ 2 ];
            }

            return memoization[ index - 1 ][ 2 ] = solveWineTaste(index - 1, 0);
        }

        if ( index - 1 < 0 ) {
            if ( memoization[ index ][ jump + 1 ] == 0 ) {
                memoization[ index ][ jump + 1 ] = wines[ index ];
            }
        } else {
            if ( memoization[ index ][ jump + 1 ] == 0 ) {
                memoization[ index ][ jump + 1 ] = solveWineTaste(index - 1, jump + 1) + wines[ index ];
            }

            if ( memoization[ index  ][ 0 ] == 0 ) {
                memoization[ index ][ 0 ] = solveWineTaste(index - 1, 0);
            }
        }

        return Math.max(memoization[ index ][ jump + 1 ], memoization[ index ][ 0 ]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] wines = new int[ n ];
        for ( int i = 0; i < n; i++ ) {
            wines[ i ] = scanner.nextInt();
        }

        System.out.println(solve(wines));
    }
}
