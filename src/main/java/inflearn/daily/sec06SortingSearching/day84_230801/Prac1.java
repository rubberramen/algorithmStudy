package inflearn.daily.sec06SortingSearching.day84_230801;

/* 1. 선택 정렬 : https://cote.inflearn.com/contest/10/problem/06-01 */

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Prac1 T = new Prac1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

//        int n = 6;
//        int[] arr = {13, 5, 11, 7, 23, 15};

        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public int[] solution_me(int n, int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {

            int k = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    k = j;
                }
            }

            int tmp = arr[k];
            arr[k] = arr[i];
            arr[i] = tmp;

            min = Integer.MAX_VALUE;
        }

        return arr;
    }

    public int[] solution_me2(int n, int[] arr) {

        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }

        return arr;
    }
}