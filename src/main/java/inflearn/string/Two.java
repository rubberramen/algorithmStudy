package inflearn.string;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Two T = new Two();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                char c = Character.toLowerCase(aChar);
                answer += c;
            } else {
                char c = Character.toUpperCase(aChar);
                answer += c;
            }
        }
        return answer;
    }
}
