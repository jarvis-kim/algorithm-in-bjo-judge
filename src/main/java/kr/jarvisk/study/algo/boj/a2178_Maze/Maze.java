package kr.jarvisk.study.algo.boj.a2178_Maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 미로 탐색
 * <p>
 * https://www.acmicpc.net/problem/2178
 */
public class Maze {

    private static int VISITED = 2;
    private static int LOAD = 1;

    public static int solve(int[][] map, int m, int n) {
        List<Integer> list = new ArrayList<>();
        dfs(map, 0, 0, m, n, 1, list);

        return list.stream().min(Integer::compareTo).get();
    }

    public static void dfs(int[][] map, int x, int y, int m, int n, int count, List<Integer> list) {
        if ( x == m - 1 && y == n - 1 ) {
            list.add(count);
            return;
        }

        map[ y ][ x ] = VISITED;
        if ( y > 0 && map[ y - 1 ][ x ] == LOAD ) {
            dfs(map, x, y - 1, m, n, count + 1, list);
        }
        if ( y < n - 1 && map[ y + 1 ][ x ] == LOAD ) {
            dfs(map, x, y + 1, m, n, count + 1, list);
        }
        if ( x > 0 && map[ y ][ x - 1 ] == LOAD ) {
            dfs(map, x - 1, y, m, n, count + 1, list);
        }
        if ( x < m - 1 && map[ y ][ x + 1 ] == LOAD ) {
            dfs(map, x + 1, y, m, n, count + 1, list);
        }

        map[ y ][ x ] = LOAD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] map = new int[ n ][ m ];

        scanner.nextLine();
        String line = null;
        for ( int i = 0; i < n; i++ ) {
            line = scanner.nextLine();
            String[] s = line.split("");
            for ( int j = 0; j < s.length; j++ ) {
                map[ i ][ j ] = Integer.parseInt(s[ j ]);
            }
        }
        System.out.println(solve(map, m, n));
    }
}
