package inflearn.daily.sec1String.day66_230711;

/* 11. 문자열 압축 : https://cote.inflearn.com/contest/10/problem/01-11 */

import java.util.Scanner;

public class Prac11 {

    public static void main(String[] args) {
        Prac11 prac1 = new Prac11();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
//        String str = "KKHSSSSSSSE";
        System.out.println(prac1.solution(str));
    }

    public String solution_best(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i);
            int tmp = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    if (j == str.length() - 1) {
                        tmp++;
                        answer += tmp;
                        return answer.replaceAll("1", "");
                    } else {
                        tmp++;
                    }
                } else {
                    answer += tmp;
                    i = j - 1;
                    break;
                }
            }
        }
        answer = answer.replaceAll("1", "");
        return answer;
    }

    public String solution_fail(String str) {
        String answer = "";
        answer += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
//            answer += str.charAt(i);
            int tmp = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    if (j == str.length() - 1) {
                        tmp++;
                        answer += tmp;
                    } else {
                        tmp++;
                    }
                } else {
                    answer += tmp;
//                    tmp = 1;
                    i = j - 1;
                    break;
//                    answer += tmp;
                }
            }
            answer += str.charAt(i);
        }
//        answer = answer.replaceAll("1", "");
        return answer;
    }
}
