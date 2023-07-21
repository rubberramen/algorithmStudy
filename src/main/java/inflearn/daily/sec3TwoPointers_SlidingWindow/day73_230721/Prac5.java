package inflearn.daily.sec3TwoPointers_SlidingWindow.day73_230721;

/* 5. 연속된 자연수의 합 : https://cote.inflearn.com/contest/10/problem/03-05 */

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Prac5 T = new Prac5();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        int n = 15;
        System.out.print(T.solution2(n));
    }


    // two pointers
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
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

    public int solution_test(int n) {
        int answer = -1;
        int sum = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // math : 몫과 나머지???
    public int solution2(int n) {
        int answer = 0;
        int cnt = 1;
        n--;

        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                System.out.println(n + " " + cnt);
                answer++;
            }
        }
        return answer;
    }
}
