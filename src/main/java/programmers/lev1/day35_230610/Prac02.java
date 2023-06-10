package programmers.lev1.day35_230610;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 문자열 내 p와 y의 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/12916 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        boolean answer = prac01.solution("Pyy");
        System.out.println("answer = " + answer);
    }

    boolean solution(String s) {
        boolean answer = true;

        String s1 = s.toLowerCase();
        int p = 0;
        int y = 0;

        String[] split = s1.split("");
        for (String s2 : split) {
            if (s2.equals("p")) {
                p++;
            } else if (s2.equals("y")) {
                y++;
            }
        }

        if (p == 0 && y == 0) {
            return true;
        }

        if (p == y) {
            return true;
        } else return false;
    }
}
