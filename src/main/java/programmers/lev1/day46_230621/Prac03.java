package programmers.lev1.day46_230621;


import java.util.*;

/* 푸드 파이트 대회 : https://school.programmers.co.kr/learn/courses/30/lessons/134240 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        String answer = prac01.solution(new int[]{1, 3, 4, 6});   // "1223330333221"
        System.out.println("answer = " + answer);
    }

    public String solution(int[] food) {      // 이게 성능 더 좋음.
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            int a = food[i] / 2;
            for (int j = 0; j < a; j++) {
                answer += String.valueOf(i);
            }
        }

        answer += String.valueOf(0);

        char[] charArray = answer.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = charArray.length - 2; i >= 0; i--) {
            list.add(charArray[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        return answer;
    }

    public String solution1(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
}
