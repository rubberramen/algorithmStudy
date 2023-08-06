package inflearn.daily.sec06SortingSearching.day89_230806;

/* 8. 이분검색 : https://cote.inflearn.com/contest/10/problem/06-08 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        Prac8 T = new Prac8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

//        int n = 8;
//        int m = 32;
//        int[] arr = {23, 87, 65, 12, 57, 32, 99, 81};
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }
        return answer;
    }

    public int solution_me(int n, int m, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] == m) {
                answer = i + 1;
            }
        }

        return answer;
    }
}