package inflearn.daily.sec3TwoPointers_SlidingWindow.day71_230719;

/* 1. 두 배열 합치기: https://cote.inflearn.com/contest/10/problem/03-01 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        Prac1 T = new Prac1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

//        int n = 3;
//        int[] a = {1, 3, 5};
//        int m = 5;
//        int[] b = {2, 3, 6, 7, 9};
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public ArrayList<Integer> solution_me(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            answer.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            answer.add(b[i]);
        }

        Collections.sort(answer);

        return answer;
    }
}
