package inflearn.daily.sec4HashMapTreeSet.day76_230724;

/* 2. 아나그램(해쉬) : https://cote.inflearn.com/contest/10/problem/04-02 */

import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();

//        String a = "AbaAeCe";
//        String b = "baeeACA";

//        String a = "abaCC";
//        String b = "Caaab";
        System.out.print(T.solution(a, b));
    }

    public String solution(String s1, String s2) {

        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";  // map.get(x) == 0 이해 안됨
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public String solution_me(String s1, String s2) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        String[] split1 = s1.split("");
        String[] split2 = s2.split("");

        for (String s : split1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (String s : split2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        boolean flag = true;

        for (String s : map1.keySet()) {
            if (map1.get(s) != map2.get(s)) {
                flag = false;
            }
        }

        if (flag) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
