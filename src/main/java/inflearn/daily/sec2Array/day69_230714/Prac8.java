package inflearn.daily.sec2Array.day69_230714;

/* 8. 등수구하기 : https://cote.inflearn.com/contest/10/problem/02-08 */

import java.util.Scanner;

public class Prac8 {

    public static void main(String[] args) {
        Prac8 prac1 = new Prac8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

//        int n = 5;
//        int[] arr = {87, 89, 92, 100, 76};
        for(int x :prac1.solution(n, arr)) System.out.print(x+" ");
    }

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        return answer;
    }
}
