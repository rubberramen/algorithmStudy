package inflearn.daily.sec05StackQueue.day80_230728;

/* 5. 쇠막대기 : https://cote.inflearn.com/contest/10/problem/05-05 */

import java.util.Scanner;
import java.util.Stack;

public class Prac5 {
    public static void main(String[] args) {
        Prac5 T = new Prac5();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.next();
        String str = "()(((()())(())()))(())";
//        String str = "(((()(()()))(())()))(()())";
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        int cnt = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            }
            else {
                stack.pop();   // 남은 괄호는 막대기 괄호.
                // 레이저
                if (str.charAt(i - 1) == '(') {
                    cnt += stack.size();    // 레이저 쏴서 새로 만들어지는 막대기 조각(왼쪽).
                }
                else {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}