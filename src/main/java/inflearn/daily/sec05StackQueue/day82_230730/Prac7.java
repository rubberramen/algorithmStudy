package inflearn.daily.sec05StackQueue.day82_230730;

/* 7. 교육과정 설계 : https://cote.inflearn.com/contest/10/problem/05-07 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
        Prac7 T = new Prac7();
//        Scanner kb = new Scanner(System.in);
//        String a = kb.next();
//        String b = kb.next();

        String a = "CBA";
        String b = "CADBGE";   // CBDAGE
        System.out.println(T.solution_me(a, b));
    }

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for (char x : need.toCharArray()) Q.offer(x);

        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) return "NO";
            }
        }

        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public String solution_me(String need, String plan) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char c : need.toCharArray()) {
            queue.offer(c);
        }

        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }
}