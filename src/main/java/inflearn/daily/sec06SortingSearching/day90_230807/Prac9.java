package inflearn.daily.sec06SortingSearching.day90_230807;

/* 9. 뮤직비디오(결정알고리즘) : https://cote.inflearn.com/contest/10/problem/06-09 */

import java.util.Arrays;
import java.util.Scanner;

public class Prac9 {
    public static void main(String[] args) {
        Prac9 T = new Prac9();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        int n = 9;
        int m = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();  // 9
        int rt = Arrays.stream(arr).sum();             // 45

//        int lt = Arrays.stream(arr).sum() / n;
//        int rt = Arrays.stream(arr).sum() / n - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }
}