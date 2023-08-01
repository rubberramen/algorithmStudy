package inflearn.daily.sec06SortingSearching.day84_230801;

/* 2. 버블 정렬 : https://cote.inflearn.com/contest/10/problem/06-02 */

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

//        int n = 6;
//        int[] arr = {13, 5, 11, 7, 23, 15};

        for (int x : T.solution_me(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public int[] solution_me(int n, int[] arr) {

        for (int i = n - 1; i > 0; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }

        return arr;
    }

    public int[] solution_fail(int n, int[] arr) {

        for (int i = n - 1; i > 0; i--) {
            for (int j = i; j >= 1; j--) {   // 여기가 문제였음ㅋㅋㅋㅋ
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }

        return arr;
    }
}