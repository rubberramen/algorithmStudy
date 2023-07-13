package inflearn.daily.sec2Array.day68_230713;

/* 7. 점수계산 : https://cote.inflearn.com/contest/10/problem/02-07 */

import java.util.Scanner;

public class Prac7 {

    public static void main(String[] args) {
        Prac7 prac1 = new Prac7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

//        int n = 8;
//        int[] arr = {0, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(prac1.solution(n, arr));
    }

    public int solution(int n, int[] arr) {

        int total = 0;
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                tmp++;
                total += tmp;
            } else {
                tmp = 0;
            }
        }

        return total;
    }
}
