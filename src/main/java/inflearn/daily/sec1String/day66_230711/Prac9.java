package inflearn.daily.sec1String.day66_230711;

/* 9. 숫자만 추출 : https://cote.inflearn.com/contest/10/problem/01-09 */

import java.util.Scanner;

public class Prac9 {

    public static void main(String[] args) {
        Prac9 prac1 = new Prac9();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(prac1.solution(str));
    }

    public int solution(String str) {

        str = str.toUpperCase().replaceAll("[A-Z]", "");
        return Integer.parseInt(str);
    }

    public int solution1(String s){
//        int answer=0;
        String answer="";
        for(char x : s.toCharArray()){
//            if(x>=48 && x<=57) answer=answer*10+(x-48);
			/*if(Character.isDigit(x)){
				answer=answer*10+ Character.getNumericValue(x);
			}*/
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }
}
