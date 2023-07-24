package inflearn.daily.sec4HashMapTreeSet.day76_230724;

/* 1. 학급 회장(해쉬) : https://cote.inflearn.com/contest/10/problem/04-01 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Prac1 T = new Prac1();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String str = kb.next();

        int n = 15;
        String str = "BACBACCACCBDEDE";
        System.out.println(T.solution(n, str));
        System.out.println(T.solution_test(n, str));
    }

    public char solution(int n, String s) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public char solution_test(int n, String s) {
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

//        System.out.println(map.containsKey('A'));
//        System.out.println(map.containsKey('P'));
        System.out.println(map.size());   // key의 갯수.
        System.out.println(map.remove('A'));  // A의 value값을 리턴함.
        System.out.println();
        System.out.println(map.size());   // key의 갯수.

        int max = Integer.MIN_VALUE;

        for (Character key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public char solution_me(int n, String s) {
        char answer = ' ';
        char[] charArray = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        map.put('A', 0);
        map.put('B', 0);
        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);

        for (char c : charArray) {
            if (c == 'A') {
                Integer integer = map.get('A');
                integer++;
                map.put('A', integer);
            } else if (c == 'B') {
                Integer integer = map.get('B');
                integer++;
                map.put('B', integer);
            } else if (c == 'C') {
                Integer integer = map.get('C');
                integer++;
                map.put('C', integer);
            } else if (c == 'D') {
                Integer integer = map.get('D');
                integer++;
                map.put('D', integer);
            } else {
                Integer integer = map.get('E');
                integer++;
                map.put('E', integer);
            }
        }

        int max = Integer.MIN_VALUE;

        for (Character character : map.keySet()) {
            if (map.get(character) > max) {
                max = map.get(character);
                answer = character;
            }
        }

        return answer;
    }
}