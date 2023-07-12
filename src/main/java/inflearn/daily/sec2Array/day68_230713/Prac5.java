package inflearn.daily.sec2Array.day68_230713;

/* 5. 소수(에라토스테네스 체) : https://cote.inflearn.com/contest/10/problem/02-05 */

import java.util.Scanner;

public class Prac5 {

    public static void main(String[] args) {
        Prac5 prac1 = new Prac5();
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 20;
        System.out.println(prac1.solution(n));

    }

    public int solution(int n) {

        int[] arr = new int[n + 1];

        int count = 0;
        for (int i = 2; i <= n; i++) {

            if (arr[i] == 0) {
                count++;
                for (int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return count;
    }
}
