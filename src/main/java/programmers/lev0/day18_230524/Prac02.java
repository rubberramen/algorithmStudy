package programmers.lev0.day18_230524;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution("allpe", "apple");
        System.out.println("answer = " + answer);
    }

    public int solution(String before, String after) {
        int answer = 0;

        String[] split = before.split("");
        String collect = Arrays.stream(split).sorted().collect(Collectors.joining());
        String[] a = collect.split("");

        String[] split2 = after.split("");
        String collect2 = Arrays.stream(split2).sorted().collect(Collectors.joining());
        String[] b = collect2.split("");

        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            if (!Objects.equals(a[i], b[i])) {
                flag = false;
            }
        }

        if (flag) {
            return 1;
        } else return 0;
    }

    public int solution1(String before, String after) {

        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
