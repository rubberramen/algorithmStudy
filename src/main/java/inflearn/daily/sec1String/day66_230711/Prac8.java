package inflearn.daily.sec1String.day66_230711;

/* 8. 유효한 팰린드롬 : https://cote.inflearn.com/contest/10/problem/01-08 */

import java.util.Scanner;

public class Prac8 {

    public static void main(String[] args) {
        Prac8 prac1 = new Prac8();
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(prac1.solution(str));
    }

    public String solution(String str) {

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        return str.equals(tmp) ? "YES" : "NO";
    }

    public String solution_fail(String[] strs) {

        boolean flag = true;

        for (int i = 0; i < strs.length / 2; i++) {
            String str1 = strs[i].toUpperCase().replaceAll("[^A-Z]", "");
            String str2 = strs[strs.length - i - 1].toUpperCase().replaceAll("[^A-Z]", "");
            str2 = new StringBuilder(str2).reverse().toString();

            if (!str1.equals(str2)) {
                flag = false;
                break;
            }
        }
        return flag ? "YES" : "NO";
    }

    public String solution1(String[] strs) {

        boolean flag = true;

        for (String str : strs) {
            str = str.toUpperCase();
            str = str.replaceAll("[^A-Z]", "");
            flag = pelin(str);
            if (!flag) {
                break;
            }
        }

        if (flag) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public boolean pelin(String str) {
        String str2 = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(str2)) {
            return true;
        } else return false;
    }
}
