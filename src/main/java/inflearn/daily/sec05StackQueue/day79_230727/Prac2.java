package inflearn.daily.sec05StackQueue.day79_230727;

/* 2. 괄호문자제거 : https://cote.inflearn.com/contest/10/problem/05-02 */

import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
        Prac2 T = new Prac2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

//        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (c == ')') {
                // 로직
                while (stack.pop() != '(') ;   // 굉장히 특이한 형태네.
            } else {
                stack.push(c);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
    public String solution_answer(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(x);
        }
        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }
}