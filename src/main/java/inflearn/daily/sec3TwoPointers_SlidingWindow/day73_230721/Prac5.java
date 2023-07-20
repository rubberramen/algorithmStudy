package inflearn.daily.sec3TwoPointers_SlidingWindow.day73_230721;

/* 5. 연속된 자연수의 합 : https://cote.inflearn.com/contest/10/problem/03-05 */

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Prac5 T = new Prac5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

//        int n = 8;
        System.out.print(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0, sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) arr[i] = i + 1;

        int lt = 0;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

    public int solution_math(int n) {
        int answer = 0;
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }
}
