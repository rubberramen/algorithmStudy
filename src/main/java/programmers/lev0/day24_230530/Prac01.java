package programmers.lev0.day24_230530;

import java.util.Arrays;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution2("3 + 4 - 5");
        System.out.println("answer = " + answer);
    }

    public int solution(String my_string) {
        int answer = 0;

        String[] s = my_string.split(" ");

        answer += Integer.parseInt(s[0]);
        for (int i = 1; i < s.length - 1; i++) {
            if (i % 2 != 0) {
                if (s[i].equals("+")) {
                    answer += Integer.parseInt(s[i+1]);
                } else answer -= Integer.parseInt(s[i+1]);
            }
        }

        return answer;
    }

    public int solution1(String myString) {

        String s = myString.replaceAll("- ", "-");
        String s1 = s.replaceAll("[+] ", "");
        String trim = s1.trim();
        String[] s2 = trim.split(" ");

        int sum = Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
        return sum;
    }

    public int solution2(String myString) {

        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").split(" ")).mapToInt(Integer::parseInt).sum();
    }

}
