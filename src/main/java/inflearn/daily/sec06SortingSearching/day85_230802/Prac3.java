package inflearn.daily.sec06SortingSearching.day85_230802;

/* 3. 삽입 정렬 : https://cote.inflearn.com/contest/10/problem/06-03 */
/* 삽입 정렬 참고 : https://st-lab.tistory.com/179 */

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Prac3 T = new Prac3();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();

        int n = 6;
        int[] arr = {11, 7, 5, 6, 10, 9};   //   // 13, 5, 11, 7, 23, 15

        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public int[] solution_me(int n, int[] arr) {

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    for (int k = i - 1; k >= j; k--) {
                        arr[k + 1] = arr[k];
                    }
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }
}