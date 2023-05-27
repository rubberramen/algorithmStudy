package programmers.lev0.day13_230519;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution2("hi12392");
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(String my_string) {
//        int[] answer = {};

        List<Integer> a = new ArrayList<>();
//        my_string.chars().filter(i -> Character.isDigit(i)).sorted().collect(Collectors.toList());

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {

                char c = my_string.charAt(i);
                int numericValue = Character.getNumericValue(c);
                a.add(numericValue);
            }
        }

        Collections.sort(a);

        int[] answer = new int[a.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = a.get(i);
        }

        return answer;
    }

    public int[] solution2(String my_string) {

        String s = my_string.replaceAll("[a-zA-Z]", "");
        String[] split = s.split("");
        Arrays.sort(split);
        return Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
    }

//    public int[] solution3(String my_string) {
//
////        return my_string.chars().filter(i -> Character.isDigit(i)).mapToInt(Integer::parseInt).sorted().toArray();
//    }

}
