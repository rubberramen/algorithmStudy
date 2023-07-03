package programmers.lev2.day58_230703;


import java.util.Arrays;
import java.util.Stack;

/* 최솟값 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12941 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        boolean answer = prac01.solution("()()");   // 37
        System.out.println("answer = " + answer);
    }

    boolean solution(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }

            if (openCount < closeCount) {
                return false;
            }
        }

        if (openCount == closeCount) {
            return true;
        }

        return false;
    }

    boolean solution_stack(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}