package inflearn.daily.sec1String.day66_230711;

/* 10. 가장 짧은 문자거리: https://cote.inflearn.com/contest/10/problem/01-10 */

import java.util.Scanner;

public class Prac10 {

    public static void main(String[] args) {
        Prac10 prac1 = new Prac10();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char c = sc.next().charAt(0);
        for (int x : prac1.solution(str, c)) {
            System.out.print(x+" ");
        }
    }

    public int[] solution(String str, char t) {

        int[] answer = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
