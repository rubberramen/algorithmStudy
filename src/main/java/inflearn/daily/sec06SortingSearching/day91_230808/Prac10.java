package inflearn.daily.sec06SortingSearching.day91_230808;

/* 10. 마구간 정하기(결정알고리즘) : https://cote.inflearn.com/contest/10/problem/06-10 */

import java.util.Arrays;
import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        Prac10 T = new Prac10();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int c = kb.nextInt();
//        int[] arr = new int[n];

        int n = 5;
        int c = 3;
        int[] arr = {1, 2, 8, 4, 9};
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, c, arr));
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;

        return answer;
    }

    public int count(int[] arr, int dist) {
        int cnt = 1;

        return cnt;
    }
}