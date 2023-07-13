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

//        int n = 9;
//        int[] arr = {32, 55, 62, 20, 250, 370, 200, 30, 100};
        for (int x : prac1.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : arr) {
//            String str = String.valueOf(i);
//            String string = new StringBuilder(String.valueOf(i)).reverse().toString();
            Integer integer = Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString());

            if (isPrime(integer)) {
                answer.add(integer);
            }
        }
        return answer;
    }

    public boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        boolean answer = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
