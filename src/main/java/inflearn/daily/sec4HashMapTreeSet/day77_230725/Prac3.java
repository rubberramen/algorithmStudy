package inflearn.daily.sec4HashMapTreeSet.day77_230725;

/* 2. 아나그램(해쉬) : https://cote.inflearn.com/contest/10/problem/04-02 */

import java.util.ArrayList;

public class Prac3 {
    public static void main(String[] args) {
        Prac3 T = new Prac3();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }

        int n = 7;
        int k = 4;
        int[] arr = {20, 12, 20, 10, 23, 17, 10};
        for (int x : T.solution(n, k, arr)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        return answer;
    }
}
