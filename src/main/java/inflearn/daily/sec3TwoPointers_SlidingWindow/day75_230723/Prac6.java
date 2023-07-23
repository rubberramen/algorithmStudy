package inflearn.daily.sec3TwoPointers_SlidingWindow.day75_230723;

/* 6. 최대 길이 연속부분수열 : https://cote.inflearn.com/contest/10/problem/03-06 */

import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        Prac6 T = new Prac6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
//        int n = 14;
//        int k = 2;
//        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        System.out.print(T.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;  // 0을 1로 바꾼 횟수
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);  // rt - lt + 1 : 연속된 1의 수열 길이
        }
        return answer;
    }
}
