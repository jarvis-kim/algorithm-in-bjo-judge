package kr.jarvisk.study.algo.bjo.a1697_HideAndSeek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 문제 : 숨바꼭질
 * BFS로 풀기
 *
 * 문제 출처 : https://www.acmicpc.net/problem/1697
 *
 * 런타임 에러
 */
public class Main {

    static final int MAX = 100001;
    static final int MIN = 0;

    public static int solve(int x, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int length = k + 1;
        int max = length > MAX ? MAX : length * 2;
        boolean[] visited = new boolean[ length * 2];
        int[] counts = new int[ length * 2 ];

        queue.add(x);
        visited[ x ] = true;

        while ( !queue.isEmpty() ) {
            int position = queue.poll();

            if ( position - 1 >= MIN && !visited[ position - 1 ] ) {
                move(position, position - 1, visited, counts, queue);
            }

            if ( position + 1 < max && !visited[ position + 1 ] ) {
                move(position, position + 1, visited, counts, queue);
            }

            if ( position * 2 < max && !visited[ position * 2 ]) {
                move(position, position * 2, visited, counts, queue);
            }
        }

        return counts[ k ];
    }

    private static void move(int position, int to, boolean[] visited, int[] counts, Queue<Integer> queue) {
        counts[ to ] = counts[ position ] + 1;
        visited[ to ] = true;
        queue.add(to);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(Main.solve(x, y));
        
    }

}
