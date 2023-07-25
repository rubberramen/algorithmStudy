package inflearn.daily.sec4HashMapTreeSet.day78_230726;

/* 5. K번째 큰 수 : https://cote.inflearn.com/contest/10/problem/04-05 */

import java.util.HashMap;
import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Prac5 T = new Prac5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }

    public int solution(int[] arr, int n, int k) {
        int answer = -1;

        return answer;
    }

}