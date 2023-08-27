package inflearn.daily.secDfsBfs.day111_230829;

/* 7. 조합의 경우수(메모이제이션) :
 */

import java.util.Scanner;

public class Prac7 {

    int[][] dy = new int[35][35];

    public static void main(String[] args) {
        Prac7 T = new Prac7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n, r));
    }

    public int DFS(int n, int r) {
        return 1;
    }
}