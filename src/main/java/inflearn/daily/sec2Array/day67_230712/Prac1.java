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
//        int n = 6;
//        int[] arr = {7, 3, 9, 5, 6, 12};
        for (int x : prac1.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public ArrayList<Integer> solution_fail(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i - 1;
            }
        }

        int a = arr[index];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}
