package programmers.lev0.day21_230527;

import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String answer = prac01.solution("abdc");
        System.out.println("answer = " + answer);
    }

    public String solution(String s) {
        char[] alphabet = new char[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 97]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 1) {
                sb.append((char) (i + 97));
            }
        }
        return sb.toString();
    }

}
