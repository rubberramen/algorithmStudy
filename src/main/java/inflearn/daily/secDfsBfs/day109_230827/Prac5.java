package inflearn.daily.secDfsBfs.day109_230827;

/* 5. 동전교환 :
    다음과 같이 여러 단위의 동전들이 주어져 있을때 거스름돈을 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가? 각 단위의 동전은 무한정 쓸 수 있다.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prac5 {

    static int n, m, answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Prac5 T = new Prac5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = kb.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    public void DFS(int L, int sum, Integer[] arr) {

    }
}