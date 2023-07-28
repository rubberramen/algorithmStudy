package inflearn.daily.sec05StackQueue.day80_230728;

/* 4. 후위식 연산(postfix) : https://cote.inflearn.com/contest/10/problem/05-04 */

import java.util.Scanner;
import java.util.Stack;

public class Prac4 {
    public static void main(String[] args) {
        Prac4 T = new Prac4();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
//        String str = "352+*9-";
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - 48);   // 아스키 문자
                /**
                 * '0' : 48
                 * '1' : 49
                 * '2' : 50...
                 */
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public int solution_me(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                int i = Integer.parseInt(Character.toString(c));
                stack.push(i);
            } else {
                switch (c) {
                    case '+':
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case '-':
                        Integer pop1 = stack.pop();
                        Integer pop2 = stack.pop();
                        stack.push(pop2 - pop1);
                        break;
                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case '/':
                        Integer pop3 = stack.pop();
                        Integer pop4 = stack.pop();
                        stack.push(pop4 / pop3);
                        break;
                }
            }
        }

        answer = stack.pop();
        return answer;
    }
}