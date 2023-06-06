package inflearn.sortingAndSearching;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {

        String answer = "";
        String[] s = str.split(" ");
        int length = s[0].length();
        answer = s[0];
        for (String s1 : s) {
            if (s1.length() > length) {
                length = s1.length();
                answer = s1;
            }
        }
        return answer;
    }

    public String solution1(String str){
        String answer="";

        int m=Integer.MIN_VALUE;
        int pos;

        while((pos=str.indexOf(' ')) != -1){
            String tmp=str.substring(0, pos);
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

}
