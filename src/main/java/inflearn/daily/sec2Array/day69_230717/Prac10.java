package inflearn.daily.sec2Array.day69_230717;

/* 9. 격자판 최대합 : https://cote.inflearn.com/contest/10/problem/02-09 */

import java.util.Scanner;

public class Prac10 {

    public static void main(String[] args) {
        Prac10 T = new Prac10();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }

        int n = 5;
        int[][] arr = {{5, 3, 7, 2, 3},
                {3, 7, 1, 6, 1},
                {7, 2, 5, 3, 4},
                {4, 3, 6, 4, 1},
                {8, 7, 3, 5, 2}};
        System.out.print(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 1; i < n - 1; i++) {

        }

        return answer;
    }

}
