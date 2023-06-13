package programmers.lev1.day38_230613;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 서울에서 김서방 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/12919 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(new int[]{3, 2, 6}, 10);   // "김서방은 1에 있다"
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }

        Collections.sort(list);

        if (list.size() == 0) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
