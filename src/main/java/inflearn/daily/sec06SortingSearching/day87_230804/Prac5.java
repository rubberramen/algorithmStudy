package inflearn.daily.sec06SortingSearching.day87_230804;

/* 5. 중복 확인 : https://cote.inflearn.com/contest/10/problem/06-05 */

import java.util.Arrays;
import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Prac5 T = new Prac5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//        int n = 4;             // 8;
//        int[] arr = {1, 7, 3, 5};          //{20, 25, 52, 30, 39, 33, 43, 33};
        System.out.println(T.solution(n, arr));
    }

    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
                break;
            }
        }
        return answer;
    }

    public String solution_me(int n, int[] arr) {
        String answer = "U";

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return "D";
                }
            }
        }

        return answer;
    }
}