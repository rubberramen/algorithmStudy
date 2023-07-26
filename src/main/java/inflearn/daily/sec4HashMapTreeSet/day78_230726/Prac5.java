package inflearn.daily.sec4HashMapTreeSet.day78_230726;

/* 5. K번째 큰 수 : https://cote.inflearn.com/contest/10/problem/04-05 */

import java.util.*;

public class Prac5 {
    public static void main(String[] args) {
        Prac5 T = new Prac5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

//        int n = 10;
//        int k = 3;
//        int[] arr = {13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

        System.out.println(T.solution(arr, n, k));
    }

    public int solution(int[] arr, int n, int k) {
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());

        for (int x : Tset) {
            //System.out.println(x);
            cnt++;
            if (cnt == k) return x;
        }
        return answer;
    }

    public int solution_me(int[] arr, int n, int k) {
        int answer = -1;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        return list.size() < k ? answer : list.get(k - 1);
    }
}