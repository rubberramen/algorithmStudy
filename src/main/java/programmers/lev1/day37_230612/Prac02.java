package programmers.lev1.day37_230612;


import java.util.Arrays;
import java.util.Collections;

/* 하샤드 수 : https://school.programmers.co.kr/learn/courses/30/lessons/12947 */

/*
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
*/

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        boolean answer = prac01.solution(11);   //true
        System.out.println("answer = " + answer);
    }

    public boolean solution(int x) {

        String[] split = String.valueOf(x).split("");
        int tmp = 0;
        for (String s : split) {
            tmp += Integer.parseInt(s);
        }

        if (x % tmp == 0) return true;
        else return false;
    }
}
