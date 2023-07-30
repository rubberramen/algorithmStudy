package inflearn.daily.sec05StackQueue.day83_230731;

/* 8. 응급실 : https://cote.inflearn.com/contest/10/problem/05-08 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        Prac8 T = new Prac8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        return answer;
    }
}

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}