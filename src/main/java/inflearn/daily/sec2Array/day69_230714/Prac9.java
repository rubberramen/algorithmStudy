package inflearn.daily.sec2Array.day69_230714;

/* 9. 격자판 최대합 : https://cote.inflearn.com/contest/10/problem/02-09 */

import java.util.Scanner;

public class Prac9 {

    public static void main(String[] args) {
        Prac9 T = new Prac9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;

        return answer;
    }
}
