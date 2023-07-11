package inflearn.daily.sec2Array.day67_230712;

/* 1. 큰 수 출력하기 : https://cote.inflearn.com/contest/10/problem/02-01 */

import java.util.ArrayList;
import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        Prac1 prac1 = new Prac1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : prac1.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }
}
