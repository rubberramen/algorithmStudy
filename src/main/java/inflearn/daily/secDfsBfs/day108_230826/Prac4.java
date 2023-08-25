package inflearn.daily.secDfsBfs.day108_230826;

/* 4. 중복순열 구하기 :
    1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로
    나열하는 방법을 모두 출력합니다.
*/

import java.util.Scanner;

public class Prac4 {

    static int[] pm;
    static int n, m;

    public static void main(String[] args) {
        Prac4 T = new Prac4();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        pm=new int[m];
        T.DFS(0);
    }

    public void DFS(int L) {

    }
}