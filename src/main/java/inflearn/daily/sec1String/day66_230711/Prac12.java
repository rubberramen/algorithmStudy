package inflearn.daily.sec1String.day66_230711;

/* 12. 암호 : https://cote.inflearn.com/contest/10/problem/01-12 */

import java.util.Scanner;

public class Prac12 {

    public static void main(String[] args) {
        Prac12 prac1 = new Prac12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
//        int n = 4;
//        String str = "#****###**#####**#####**##**";
        System.out.println(prac1.solution(n, str));
    }

    public String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");
            answer += (char) Integer.parseInt(tmp, 2);
            str = str.substring(7);
        }
        return answer;
    }

    public String solution1(int n, String str) {
        String answer = "";

//        String[] test = new String[n];

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7);
            tmp = tmp.replace("#", "1");
            tmp = tmp.replace("*", "0");

            int i1 = Integer.parseInt(tmp, 2);

            char c = (char) i1;
            answer += c;

            str = str.substring(7);
        }

        return answer;
    }
}
