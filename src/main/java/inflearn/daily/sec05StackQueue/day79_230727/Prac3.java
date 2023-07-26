package inflearn.daily.sec05StackQueue.day79_230727;

/*3. 크레인 인형뽑기(카카오) : https://cote.inflearn.com/contest/10/problem/05-03 */

import java.util.*;

public class Prac3 {
    public static void main(String[] args) {
        Prac3 T = new Prac3();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] board = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                board[i][j] = kb.nextInt();
//            }
//        }
//        int m = kb.nextInt();
//        int[] moves = new int[m];
//        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();

        int n = 5;
        int[][] board = {{0, 0, 0, 0, 0,}, {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};

        int m = 8;
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(T.solution(board, moves));
    }

    public String solution(String str) {
        String answer = "";

        return answer;
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        return answer;
    }
}