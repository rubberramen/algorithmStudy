package programmers.lev1.day39_230614;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 제일 작은 수 제거하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12935 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(new int[]{4,3,2,1});   // [4, 3, 2]
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = new int[]{-1};
            return answer;
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        Integer min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer <= min) {
                min = integer;
            }
        }

        list.remove(min);

        int[] answer = new int[arr.length - 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
