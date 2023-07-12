package inflearn.daily.sec2Array.day68_230713;

/* 6. 뒤집은 소수 : https://cote.inflearn.com/contest/10/problem/02-06 */

import java.util.ArrayList;
import java.util.Scanner;

public class Prac6 {

    public static void main(String[] args) {
        Prac6 prac1 = new Prac6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : prac1.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr) {

        return null;
    }
}
