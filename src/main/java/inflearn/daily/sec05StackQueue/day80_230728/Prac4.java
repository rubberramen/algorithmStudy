package inflearn.daily.sec05StackQueue.day80_230728;

/* 4. 후위식 연산(postfix) : https://cote.inflearn.com/contest/10/problem/05-04 */

import java.util.Scanner;
import java.util.Stack;

public class Prac4 {
    public static void main(String[] args) {
        Prac4 T = new Prac4();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.next();
        String str = "352+*9-";
        System.out.println(T.solution(str));
    }

    public int solution(String str){
        int answer=0;
        Stack<Integer> stack = new Stack<>();

        return answer;
    }
}