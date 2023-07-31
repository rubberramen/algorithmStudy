package inflearn.daily.sec05StackQueue.day83_230731;

/* 8. 응급실 : https://cote.inflearn.com/contest/10/problem/05-08 */

import java.util.Arrays;
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

//        int n = 6;
//        int m = 3;
//        int[] arr = {70, 60, 90, 60, 60, 60};  // 60, 50, 70, 80, 90

        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }

        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }

        return answer;
    }

    // fail
    public int solution_fail(int n, int m, int[] arr) {
        int answer = 0;

        int a = arr[m];
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                answer = i + 1;
            }
        }

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