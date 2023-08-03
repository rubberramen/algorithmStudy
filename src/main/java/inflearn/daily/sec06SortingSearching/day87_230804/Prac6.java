package inflearn.daily.sec06SortingSearching.day87_230804;

/* 6. 장난꾸러기 : https://cote.inflearn.com/contest/10/problem/06-06 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        Prac6 T = new Prac6();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
//        int n = 9;
//        int[] arr = {120, 125, 152, 130, 135, 135, 143, 127, 160};
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();

        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }

        return answer;
    }
}