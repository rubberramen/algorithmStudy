package inflearn.daily.sec2Array.day67_230712;

/* 2. 보이는 학생 : https://cote.inflearn.com/contest/10/problem/02-02 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac2 {

    public static void main(String[] args) {
        Prac2 prac1 = new Prac2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int n = 8;
//        int[] arr = {130, 135, 148, 140, 145, 150, 150, 153};
        System.out.println(prac1.solution(n, arr));
    }

    public int solution(int n, int[] arr) {

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }

        return list.size();
    }
}
