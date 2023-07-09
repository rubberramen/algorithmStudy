package inflearn.daily.sec1String.day65_230710;

/* 단어 뒤집기 : https://cote.inflearn.com/contest/10/problem/01-04 */

import java.util.ArrayList;
import java.util.Scanner;

public class Prac4 {

    public static void main(String[] args) {
        Prac4 prac1 = new Prac4();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            strs[i] = str;
        }

        ArrayList<String> solution = prac1.solution2(n, strs);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public ArrayList<String> solution(int n, String[] strs) {

        ArrayList<String> list = new ArrayList<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            String tmp = "";
            for (int i = chars.length - 1; i >= 0; i--) {
                tmp += chars[i];
            }
            list.add(tmp);
        }
        return list;
    }

    public ArrayList<String> solution2(int n, String[] strs) {

        ArrayList<String> list = new ArrayList<>();

        for (String str : strs) {
            String tmp = new StringBuilder(str).reverse().toString();
            list.add(tmp);
        }

        return list;
    }
}
