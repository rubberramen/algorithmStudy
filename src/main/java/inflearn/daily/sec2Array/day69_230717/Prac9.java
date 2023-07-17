package inflearn.daily.sec2Array.day69_230717;

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

//        int n = 5;
//        int[][] arr = {{10, 13, 10, 12, 15},
//                {12, 39, 30, 23, 11},
//                {11, 25, 50, 53, 15},
//                {19, 27, 29, 37, 27},
//                {19, 13, 30, 13, 19}};
        System.out.print(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = -2147000000;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public int solution1(int n, int[][] arr) {
        int answer = 0;

        // 가로
        for (int i = 0; i < n; i++) {
            int sumHorizontal = 0;
            for (int j = 0; j < n; j++) {
                sumHorizontal += arr[i][j];
            }
            if (answer < sumHorizontal) {
                answer = sumHorizontal;
            }
        }


        // 세로

        for (int i = 0; i < n; i++) {
            int sumVertical = 0;
            for (int j = 0; j < n; j++) {
                sumVertical += arr[j][i];
            }
            if (answer < sumVertical) {
                answer = sumVertical;
            }
        }

        // 대각선 1
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
        }
        if (answer < sum1) {
            answer = sum1;
        }

        // 대각선 2
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i][n - i - 1];
        }
        if (answer < sum2) {
            answer = sum2;
        }

        return answer;
    }
}
