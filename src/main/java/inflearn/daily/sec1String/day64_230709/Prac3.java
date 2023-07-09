package inflearn.daily.sec1String.day64_230709;

/* 문장 속 단어 : https://cote.inflearn.com/contest/10/problem/01-03 */

import java.util.Scanner;

public class Prac3 {

    public static void main(String[] args) {
        Prac3 prac1 = new Prac3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(prac1.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }
}
