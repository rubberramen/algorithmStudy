package inflearn.daily.sec1String.day65_230710;

/* 7. 회문 문자열 : https://cote.inflearn.com/contest/10/problem/01-07 */

import java.util.Scanner;

public class Prac7 {

    public static void main(String[] args) {
        Prac7 prac1 = new Prac7();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        System.out.println(prac1.solution(next));
    }

    public String solution(String str) {

        str = str.toUpperCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return "NO";
            }
        }

        return "YES";
    }

    public String solution2(String str) {

        String str2 = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(str2)) {
            return "YES";
        } else return "NO";
    }
}
