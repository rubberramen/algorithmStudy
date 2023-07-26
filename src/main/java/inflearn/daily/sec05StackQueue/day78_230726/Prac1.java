package inflearn.daily.sec05StackQueue.day78_230726;

/* 1. 올바른 괄호 : https://cote.inflearn.com/contest/10/problem/05-01 */

import java.util.*;

public class Prac1 {
    public static void main(String[] args) {
        Prac1 T = new Prac1();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();

//        String str = "(()(()))(()";
        String str = ")()()";

        System.out.println(T.solution(str));
    }

    public String solution(String str) {

        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return "NO";  // 추가
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    // EmptyStackException : 비었는데 pop을 하려고 해서
    public String solution_fail(String str) {

        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
//                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}