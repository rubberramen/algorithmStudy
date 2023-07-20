package inflearn.daily.sec3TwoPointers_SlidingWindow.day73_230721;

/* 6. 최대 길이 연속부분수열 : https://cote.inflearn.com/contest/10/problem/03-06 */

import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        Prac6 T = new Prac6();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr){
        int answer = 0, sum = 0;

        return answer;
    }
}
