package programmers.lev0.day16_230522;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution("Bcad");
        System.out.println("answer = " + answer);
    }

    public String solution(String my_string) {
        String s = my_string.toLowerCase();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public String solution2(String my_string) {
        return Arrays.stream(my_string.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.joining());
    }

}
