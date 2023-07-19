package inflearn.daily.sec3TwoPointers_SlidingWindow.day71_230719;

/* 2. 공통원소 구하기 : https://cote.inflearn.com/contest/10/problem/03-02 */

import java.util.*;

public class Prac2 {

    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

//        int n = 5;
//        int[] a = {1, 3, 9, 5, 2};
//        int m = 5;
//        int[] b = {3, 2, 5, 7, 8};
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    // Time Limit Exceeded2
    public ArrayList<Integer> solution_fail2(int n, int m, int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        for (int i1 : a) {
            for (int i2 : b) {
                if (i1 == i2) {
                    set.add(i1);
                }
            }
        }

        ArrayList<Integer> answer = new ArrayList<>(set);
        Collections.sort(answer);

        return answer;
    }

    // Time Limit Exceeded
    public ArrayList<Integer> solution_fail(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i1 : a) {
            for (int i2 : b) {
                if (i1 == i2) {
                    set.add(i1);
                }
            }
        }

        for (Integer integer : set) {
            answer.add(integer);
        }

        Collections.sort(answer);

        return answer;
    }
}
