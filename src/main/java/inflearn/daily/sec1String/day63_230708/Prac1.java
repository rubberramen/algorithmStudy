package inflearn.daily.sec1String.day63_230708;

/* 문자 찾기 : https://cote.inflearn.com/contest/10/problem/01-01 */

import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        Prac1 prac1 = new Prac1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(prac1.solution(str, c));
    }

    public int solution(String str, char c) {
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        int answer = 0;

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == c) {
                answer++;
            }
        }
        return answer;
    }
}
