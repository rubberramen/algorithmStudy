package programmers.lev0.day12_230518;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String answer = prac01.solution("dfjardstddetckdaccccdegk", 4);
        System.out.println("answer = " + answer);
    }

    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        int length = cipher.length();
        for (int i = code-1; i < length; i += code) {
            answer.append(cipher.charAt(i));
        }
        return answer.toString();
    }

    public String solution2(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }

}
