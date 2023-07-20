package inflearn.daily.sec3TwoPointers_SlidingWindow.day72_230720;

/* 4. 연속 부분수열 : https://cote.inflearn.com/contest/10/problem/03-04 */

import java.util.Scanner;

public class Prac4 {

    public static void main(String[] args) {
        Prac4 T = new Prac4();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

//        int n = 8;
//        int m = 6;
//        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};

        System.out.print(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) answer++;
            while (sum >= m) {   // 여기가 중요
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }

        return answer;
    }

    public int solution_me(int n, int m, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == m) {
                    answer++;
                } else if (sum > m) {
                    break;
                }
            }
        }

        return answer;
    }
}
