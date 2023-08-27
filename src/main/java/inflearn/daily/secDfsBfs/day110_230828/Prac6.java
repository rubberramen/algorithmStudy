package inflearn.daily.secDfsBfs.day110_230828;

/* 6. 순열 구하기 :
    10이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prac6 {

    static int[] pm, ch, arr;
    static int n, m;

    public static void main(String[] args) {
        Prac6 T = new Prac6();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }

    public void DFS(int L) {
        
    }
}