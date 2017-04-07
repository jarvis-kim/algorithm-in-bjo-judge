package kr.jarvisk.study.algo.boj.a1475_RoomNumber;

import java.util.Scanner;

/**
 * 방 번호
 * https://www.acmicpc.net/problem/1475
 */
public class RoomNumber {

    public static int solve(int n) {
        int[] numbers = new int[ 10 ];
        int length = (int) (Math.log10(n) + 1);
        int digits = 1;
        int num;
        for ( int i = 0; i < length; i++ ) {
            num = n / digits % 10;
            numbers[ num ]++;
            digits *= 10;
        }

        int max = 0;
        for ( int i = 0; i < numbers.length; i++ ) {
            int m = numbers[ i ];
            if ( i == 6 || i == 9 ) {
                m = (numbers[ 6 ] + numbers[ 9 ] + 1) / 2;
            }
            max = Math.max(max, m);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solve(n));
    }
}
