package programmers.lev0.day12_230518;

import java.util.stream.Collectors;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution3("cccCCC");
        System.out.println("answer = " + answer);
    }

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                char c = Character.toLowerCase(my_string.charAt(i));
                sb.append(c);
            } else {
                char c = Character.toUpperCase(my_string.charAt(i));
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public String solution2(String my_string) {
        // StringBuilder sb = new StringBuilder();

        return my_string.chars().mapToObj(i -> String.valueOf((char) (Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i)))).collect(Collectors.joining());
    }

    public String solution3(String my_string) {   // TODO: 2023-05-18 018  
        // StringBuilder sb = new StringBuilder();

        return my_string.chars().map(i -> Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i)).mapToObj(String::valueOf).collect(Collectors.joining());
//        return my_string.chars(i -> Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i)).mapToObj(String::valueOf).collect(Collectors.joining());
    }

}
