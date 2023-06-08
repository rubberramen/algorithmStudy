package inflearn.string;

import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {
        String3 t = new String3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution(str));
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
}
