package inflearn.daily.sec06SortingSearching.day86_230803;

/* 4. Least Recently Used : https://cote.inflearn.com/contest/10/problem/06-04 */

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Prac4 T = new Prac4();
        Scanner kb = new Scanner(System.in);
//        int s = kb.nextInt();
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        int s = 5;
        int n = 9;
        int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        return cache;
    }
}