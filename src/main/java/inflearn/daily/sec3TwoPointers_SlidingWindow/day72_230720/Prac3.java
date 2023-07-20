package inflearn.daily.sec3TwoPointers_SlidingWindow.day72_230720;

/* 3. 최대 매출 : https://cote.inflearn.com/contest/10/problem/03-03 */

import java.util.*;

public class Prac3 {

    public static void main(String[] args) {
        Prac3 T = new Prac3();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

//        int n = 10;
//        int k = 3;
//        int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

//        int n = 6;
//        int k = 2;
//        int[] arr = {17, 15, 19, 21, 18, 16};

        System.out.print(T.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    // Time Limit Exceeded
    public int solution_fail(int n, int k, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n - (k - 1); i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if (answer < sum) {
                answer = sum;
            }
        }

        return answer;
    }
}
