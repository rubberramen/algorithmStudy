package inflearn.daily.sec06SortingSearching.day86_230803;

/* 4. Least Recently Used : https://cote.inflearn.com/contest/10/problem/06-04 */

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Prac4 T = new Prac4();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

//        int s = 5;
//        int n = 9;
//        int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i;
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public int[] solution_me(int size, int n, int[] arr) {
        int[] cache = new int[size];

        for (int i = 0; i < n; i++) {

            boolean flag = false;
            for (int j = 1; j < size; j++) {
                if (cache[j] == arr[i]) {
                    for (int k = j - 1; k >= 0; k--) {
                        cache[k + 1] = cache[k];
                    }
                    flag = true;
                }
            }

            if (!flag) {
                for (int j = size - 2; j >= 0; j--) {
                    cache[j + 1] = cache[j];
                }
            }

            cache[0] = arr[i];
        }
        return cache;
    }
}