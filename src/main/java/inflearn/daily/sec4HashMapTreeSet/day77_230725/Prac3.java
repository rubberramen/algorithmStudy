package inflearn.daily.sec4HashMapTreeSet.day77_230725;

/* 3. 매출액의 종류 : https://cote.inflearn.com/contest/10/problem/04-03 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

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
        HashMap<Integer, Integer> HM = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) - 1);
            if (HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    // Time Limit Exceeded
    public ArrayList<Integer> solution_fail(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n - k + 1; i++) {
            HashSet<Integer> tmp = new HashSet<>();
            for (int j = i; j < k + i; j++) {
                tmp.add(arr[j]);
            }
            int size = tmp.size();
            answer.add(size);
        }

        return answer;
    }
}
