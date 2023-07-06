package programmers.lev2.day61_230706;


import java.util.Stack;

/* 짝지어 제거하기: https://school.programmers.co.kr/learn/courses/30/lessons/12973 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution("cdcd");   // 1
        System.out.println("answer = " + answer);
    }

    public int solution(String s) {

        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
    public int solution_fail2(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }

        while (true) {
            int tmp11 = s.length();
            int tmp22 = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    String tmp1 = s.substring(0, i);
                    String tmp2 = s.substring(i + 2);
                    s = tmp1 + tmp2;
                }
            }

            tmp22 = s.length();

            if (s.length() == 0) {
                return 1;
            }

            if (tmp11 == tmp22) {
                return -0;
            }
        }
    }

    public int solution_fail(String s) {
        int answer = -1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                String tmp1 = s.substring(0, i);
                String tmp2 = s.substring(i + 2);
                s = tmp1 + tmp2;
            }
        }

        if (s.length() % 2 != 0) {
            return 0;
        } else {
            if (s.charAt(0) == s.charAt(1)) {
                return 1;
            } else return 0;
        }
    }
}