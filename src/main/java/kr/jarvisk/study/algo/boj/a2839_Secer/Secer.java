package kr.jarvisk.study.algo.boj.a2839_Secer;

/**
 * 설탕 배달
 * https://www.acmicpc.net/problem/2839
 */
public class Secer {

    public static int solve(int n) {
        if ( n == 3 || n == 5) {
            return 1;
        }
        if ( n < 5 ) {
            return -1;
        }

        int b = 0, a = 0;
        a = solve(n - 5);
        b = solve(n - 3);

        if ( a == -1 && b == -1 ) {
            return -1;
        }
        if ( a < 0 ) {
            return b + 1;
        }
        if ( b < 0 ) {
            return a + 1;
        }
        
        return Math.min(a, b) + 1;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
    }

}
