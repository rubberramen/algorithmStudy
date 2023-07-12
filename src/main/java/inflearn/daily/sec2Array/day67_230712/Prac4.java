package inflearn.daily.sec2Array.day67_230712;

/* 4. 피보나치 수열 : https://cote.inflearn.com/contest/10/problem/02-04 */

import java.util.Scanner;

public class Prac4 {

    public static void main(String[] args) {
        Prac4 prac1 = new Prac4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int n = 10;

        for (int i : prac1.solution(n)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n) {

        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
}