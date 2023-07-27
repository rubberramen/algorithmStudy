package inflearn.daily.sec05StackQueue.day79_230727;

/*3. 크레인 인형뽑기(카카오) : https://cote.inflearn.com/contest/10/problem/05-03 */

import java.util.*;

public class Prac3 {
    public static void main(String[] args) {
        Prac3 T = new Prac3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = kb.nextInt();

//        int n = 5;
//        int[][] board = {{0, 0, 0, 0, 0,}, {0, 0, 1, 0, 3},
//                {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//
//        int m = 8;
//        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(T.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }

    public int solution_me(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    int doll = board[j][move - 1];
                    board[j][move - 1] = 0;
                    stack.push(doll);
                    break;
                }
            }
        }

        // 와 이게 되네ㅋㅋㅋㅋㅋ
        for (int i = stack.size() - 1; i > 0; i--) {
            if (stack.get(i) == stack.get(i - 1)) {
                answer += 2;
                stack.remove(i);
                stack.remove(i - 1);
            }
        }

        return answer;
    }
}