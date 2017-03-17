package kr.jarvisk.study.algo.bjo.a13913_HideAndSeek4;

import java.util.*;

/**
 *  문제 : 숨바꼭질4
 *
 *  BFS를 이용. 숨바꼭질1에서는 이동횟수만 출력. 숨바꼭질4는 경로를 출력한다.
 *
 * 출처 :
 *
 * 런타임 에러
 */
public class Main {

    public int[] solve(int x, int k) {
        Queue<Integer> queue = new LinkedList<>();
        final int min = 0;
        final int max = k * 2;

        int length = max;
        boolean[] visited = new boolean[ length ];
        int[] via = new int[ length ];

        queue.add(x);
        visited[ x ] = true;

        while ( !queue.isEmpty() && !visited[ k ] ) {
            int position = queue.poll();

            if ( position - 1 > min && !visited[ position - 1 ] ) {
                move(position, position - 1, visited, via, queue);
            }

            if ( position * 2 < max && !visited[ position * 2 ]) {
                move(position, position * 2, visited, via, queue);
            }

            if ( position + 1 < max && !visited[ position + 1 ] ) {
                move(position, position + 1, visited, via, queue);
            }
        }

        List<Integer> minimumVia = new ArrayList<>();
        minimumVia.add(k);
        int next = k;
        while ( via[ next ] != 0 ) {
            minimumVia.add(via[ next ]);
            next = via[ next ];
        }


        Collections.reverse(minimumVia);

        return minimumVia.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void move(int position, int to, boolean[] visited, int[] via,  Queue<Integer> queue) {
        via[ to ] = position;
        visited[ to ] = true;
        queue.add(to);
    }
}
