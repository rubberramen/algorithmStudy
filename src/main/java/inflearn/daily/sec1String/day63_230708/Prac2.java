package inflearn.daily.sec1String.day63_230708;

/* 대소문자 변환 : https://cote.inflearn.com/contest/10/problem/01-02 */

import java.util.Scanner;

public class Prac2 {

    public static void main(String[] args) {
        Prac2 prac1 = new Prac2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(prac1.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                answer += Character.toLowerCase(aChar);
            } else {
                answer += Character.toUpperCase(aChar);
            }
        }
        return answer;
    }
}
