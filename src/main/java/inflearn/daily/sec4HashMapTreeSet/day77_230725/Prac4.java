package inflearn.daily.sec4HashMapTreeSet.day77_230725;

/* 4. 모든 아나그램 찾기 : https://cote.inflearn.com/contest/10/problem/04-04 */

import java.util.HashMap;
import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Prac4 T = new Prac4();
        Scanner kb = new Scanner(System.in);
//        String a = kb.next();
//        String b = kb.next();

        String a = "bacaAacba";
        String b = "abc";
        System.out.print(T.solution(a, b));
    }

    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
        int L = b.length() - 1;  //2

        for (int i = 0; i < L; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);

            if (am.equals(bm)) answer++;    // HashMap에도 equals() 가능

            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);

            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }

    public int solution_me(String a, String b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(a);

        for (int i = 0; i <= a.length() - b.length(); i++) {
            String tmp = sb.substring(i, i + b.length());

            // 아나그램 대상
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : b.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // 아나그램 로직
            boolean flag = true;
            for (char c : tmp.toCharArray()) {
                if (!map.containsKey(c) || map.get(c) == 0) {
                    flag = false;
                    break;
                }
                map.put(c, map.get(c) - 1);
            }

            if (flag) answer++;
        }
        return answer;
    }

    public int solution_test(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> standard = new HashMap<>();

        for (Character s : b.toCharArray()) {
            standard.put(s, standard.getOrDefault(s, 0) + 1);
        }

        char[] aArray = a.toCharArray();

        int lt = 0;

        HashMap<Character, Integer> tmp = new HashMap<>();
        for (int i = 0; i < b.length() - 1; i++) {
            tmp.put(aArray[i], tmp.getOrDefault(aArray[i], 0) + 1);
        }

        for (int rt = b.length() - 1; rt < a.length(); rt++) {
            tmp.put(aArray[rt], tmp.getOrDefault(aArray[rt], 0) + 1);

        }
        return answer;
    }
}