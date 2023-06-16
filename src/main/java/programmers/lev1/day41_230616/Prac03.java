package programmers.lev1.day41_230616;


import java.util.ArrayList;
import java.util.List;

/* 최댓값과 최솟값 : https://school.programmers.co.kr/learn/courses/30/lessons/12939 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        String answer = prac01.solution("-1 -2 -3 -4");   // false
        System.out.println("answer = " + answer);
    }

    public String solution(String s) {
        String answer = "";

        String[] split = s.split(" ");
        List<Integer> list = new ArrayList<>();

        for (String s1 : split) {
            int i = Integer.parseInt(s1);
            list.add(i);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }

        answer = min + " " + max;
        return answer;
    }
}
