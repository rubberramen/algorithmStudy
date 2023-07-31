package inflearn.daily.sec06SortingSearching.day84_230801;

/* 1. 선택 정렬 : https://cote.inflearn.com/contest/10/problem/06-01 */

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Prac1 T = new Prac1();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        int n = 6;
        int[] arr = {13, 5, 11, 7, 23, 15};

        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr) {
        return new int[]{1, 2, 3};
    }
}