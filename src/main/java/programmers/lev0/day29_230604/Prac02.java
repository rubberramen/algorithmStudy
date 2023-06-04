package programmers.lev0.day29_230604;

import java.util.*;

/* 다항식 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120863 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution("3x + 7 + x");
        System.out.println("answer = " + answer);
    }

    public String solution(String polynomial) {
        int xNum = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) // x가 있으면
                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            else if (!s.equals("+"))
                num += Integer.parseInt(s);
        }

        return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "")
                + (num != 0 ? (xNum != 0 ? " + " : "")
                + num : xNum == 0 ? "0" : "");
    }


    public String solution_fail1(String polynomial) {
        String answer = "";

        String x = "";
        int n = 0;
        int b = 0;

        String[] split = polynomial.split("[+]");
        for (String s : split) {
            String trim = s.trim();
            if (trim.contains("x")) {
                int a = 0;
                if (trim.length() == 1 || trim.contains("1")) {
                    a = 1;
                } else {
                    a = Integer.parseInt(trim.replace("x", ""));
                }
                b += a;
            } else {
                n += Integer.parseInt(trim);
            }
        }

        if (b == 0) {
            answer = Integer.toString(n);
        } else if (n == 0) {
            answer = b + "x";
        } else {
            if (b == 1) {
                x = "x";
            } else {
                x = b + "x";
            }
            answer = x + " + " + n;
        }

        return answer;
    }

}
