package inflearn.daily.sec05StackQueue.day81_230729;

/* 6. 공주 구하기 : https://cote.inflearn.com/contest/10/problem/05-06 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Prac6 {
    public static void main(String[] args) {
        Prac6 T = new Prac6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
//        int n = 8;
//        int k = 3;
        System.out.println(T.solution(n, k));
    }

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i <= n; i++) Q.offer(i);

        while (!Q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll());
            }
            Q.poll();

            if (Q.size() == 1) {
                answer = Q.poll();
            }
        }
        return answer;
    }

    public int solution_me(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()) {

            for (int i = 1; i < k; i++) {
                q.offer(q.poll());
            }

            q.poll();

            if (q.size() == 1) {
                answer = q.poll();
            }
        }

        return answer;
    }
}