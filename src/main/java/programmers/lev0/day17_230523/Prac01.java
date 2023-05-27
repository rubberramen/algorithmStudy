package programmers.lev0.day17_230523;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String answer = prac01.solution3("We are the world");
        System.out.println("answer = " + answer);
    }

    public String solution(String my_string) {
        String answer = "";

        String[] split = my_string.split("");
        List<String> strings = Arrays.asList(split);
        List<String> a = new ArrayList<>();
        a.add(strings.get(0));

        for (int i = 1; i < strings.size(); i++) {
            boolean b = true;
            boolean c = true;

            for (int j = 0; j < a.size(); j++) {
                if (a.get(j).equals(strings.get(i))) {
                    c = false;
                }
            }

            if (b && c) {
                a.add(strings.get(i));
                c = true;
            }
        }

        for (String string : a) {
            answer += string;
        }
        return answer;
    }

    public String solution2(String my_string) {
        StringBuilder answer = new StringBuilder();

        String[] split = my_string.split("");
        List<String> strings = Arrays.asList(split);
        List<String> a = new ArrayList<>();
        a.add(strings.get(0));

        for (int i = 1; i < strings.size(); i++) {
            boolean c = true;

            for (String s : a) {
                if (s.equals(strings.get(i))) {
                    c = false;
                    break;
                }
            }

            if (c) {
                a.add(strings.get(i));
                c = true;
            }
        }

        for (String string : a) {
            answer.append(string);
        }
        return answer.toString();
    }

    public String solution3(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining());
    }

    public String solution4(String my_string) {

        String[] split = my_string.split("");
        Stream<String> distinct = Arrays.stream(split).distinct();

        char[] chars = my_string.toCharArray();



        return my_string.chars().distinct().mapToObj(String::valueOf).collect(Collectors.joining());
    }

}
