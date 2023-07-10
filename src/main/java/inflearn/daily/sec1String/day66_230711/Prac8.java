package inflearn.daily.sec1String.day66_230711;

/* 8. 유효한 팰린드롬 : https://cote.inflearn.com/contest/10/problem/01-08 */

import java.util.Scanner;

public class Prac8 {

    public static void main(String[] args) {
        Prac8 prac1 = new Prac8();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        String[] split = next.split(" ");
        System.out.println(prac1.solution(split));
    }

    public String solution(String[] strs) {
        return "";
    }

    public boolean pelin(String str) {
        String str2 = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(str2)) {
            return true;
        } else return false;
    }
}
