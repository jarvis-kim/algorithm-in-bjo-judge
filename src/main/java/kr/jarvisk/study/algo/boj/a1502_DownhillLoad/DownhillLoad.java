package kr.jarvisk.study.algo.boj.a1502_DownhillLoad;

import java.util.Scanner;

/**
 * 내리막 길
 * https://www.acmicpc.net/problem/1520
 * <p>
 * 어익후..재귀로 하면 계속 시간 초과가 나오네.. 메모이제이션 문제가 아닌듯..
 * 일단 패스.
 */
public class DownhillLoad {

    private int[][] map;

    private int[][] pathCount;

    int x, y;

    public DownhillLoad(int[][] map) {
        this.map = map;
        pathCount = new int[ map.length ][];
        for ( int i = 0; i < map.length; i++ ) {
            pathCount[ i ] = new int[ map[ i ].length ];
        }

        y = map.length;
        x = map[ 0 ].length;
        pathCount[ 0 ][ 0 ] = 1;
    }

    public int solve(int m, int n) {
        int sum = 0;

        if ( m - 1 >= 0 && map[ m ][ n ] < map[ m - 1 ][ n ] ) {
            if ( pathCount[ m - 1 ][ n ] == 0 ) {
                pathCount[ m - 1 ][ n ] = solve(m - 1, n);
            }
            sum += pathCount[ m - 1 ][ n ] > 0 ? pathCount[ m - 1 ][ n ] : 0;
        }

        if ( n - 1 >= 0 && map[ m ][ n ] < map[ m ][ n - 1 ] ) {
            if ( pathCount[ m ][ n - 1 ] == 0 ) {
                pathCount[ m ][ n - 1 ] = solve(m, n - 1);
            }
            sum += pathCount[ m ][ n - 1 ] > 0 ? pathCount[ m ][ n - 1 ] : 0;
        }

        if ( n + 1 < x && map[ m ][ n ] < map[ m ][ n + 1 ] ) {
            if ( pathCount[ m ][ n + 1 ] == 0 ) {
                pathCount[ m ][ n + 1 ] = solve(m, n + 1);
            }
            sum += pathCount[ m ][ n + 1 ] > 0 ? pathCount[ m ][ n + 1 ] : 0;
        }

        pathCount[ m ][ n ] += sum;

        if ( pathCount[ m ][ n ] == 0 ) {
            pathCount[ m ][ n ] = -1;
        }

        return pathCount[ m ][ n ] > 0 ? pathCount[ m ][ n ] : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] map = new int[ m ][ n ];

        for ( int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                map[ i ][ j ] = scanner.nextInt();
            }
        }

        System.out.println(new DownhillLoad(map).solve(m - 1, n - 1));
    }
}
