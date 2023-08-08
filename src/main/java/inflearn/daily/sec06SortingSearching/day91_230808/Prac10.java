package inflearn.daily.sec06SortingSearching.day91_230808;

/* 10. 마구간 정하기(결정알고리즘) : https://cote.inflearn.com/contest/10/problem/06-10 */

import java.util.Arrays;
import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        Prac10 T = new Prac10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

//        int n = 5;
//        int c = 3;
//        int[] arr = {1, 2, 8, 4, 9};

        System.out.println(T.solution(n, c, arr));
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);   // 1, 2, 4, 8, 9
        int lt = 1;
        int rt = arr[n - 1];   // 9   arr[n - 1] - arr[0]
        while (lt <= rt) {
            int mid = (lt + rt) / 2;   // 가장 가까운 두 말의 거리를 mid라고 하고 배치할 때 3마리 배치할 수 있는지
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    public int count(int[] arr, int dist) {  // 몇마리를 배치할 수 있는지.
        int cnt = 1;
        int ep = arr[0];   // ep : end position.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}