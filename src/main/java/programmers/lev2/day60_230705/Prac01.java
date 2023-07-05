package programmers.lev2.day60_230705;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 다음 큰 숫자: https://school.programmers.co.kr/learn/courses/30/lessons/12911 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(78);   // 83
        System.out.println("answer = " + answer);
    }

    public int solution(int n) {
        int answer = 0;

        String binaryString = Integer.toBinaryString(n);
        int numOne = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') numOne++;
        }

        while (true) {
            n++;
            String binaryString1 = Integer.toBinaryString(n);
            int tmp = 0;
            for (int i = 0; i < binaryString1.length(); i++) {
                if (binaryString1.charAt(i) == '1') tmp++;
            }

            if (tmp == numOne) return n;
        }
    }

    public int solution_fail(int n) {     // Runtime Error

        String binaryString = Integer.toBinaryString(n);
        String[] split = binaryString.split("");
        int numOne = 0;
        for (String s : split) {
            if (s.equals("1")) {
                numOne++;
            }
        }

        while (true) {
            n++;
            String binaryString1 = Integer.toBinaryString(n);
            String[] split1 = binaryString1.split("");
            int tmp = 0;
            for (String s : split1) {
                if (s.equals("1")) {
                    tmp++;
                }
            }

            if (tmp == numOne) {
                return n;
            }
        }
    }
}