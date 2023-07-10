package inflearn.daily.sec1String.day65_230710;

/* 6. 중복문자제거 : https://cote.inflearn.com/contest/10/problem/01-06 */

import java.util.Scanner;

public class Prac6 {

    public static void main(String[] args) {
        Prac6 prac1 = new Prac6();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        System.out.println(prac1.solution(next));
    }

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

}
