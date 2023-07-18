package inflearn.daily.sec3TwoPointers_SlidingWindow;

/* 1. 두 배열 합치기: https://cote.inflearn.com/contest/10/problem/03-01 */

import java.util.ArrayList;
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
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }
}
