package programmers.lev2.day62_230707;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 카펫: https://school.programmers.co.kr/learn/courses/30/lessons/42842 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int[] answer = prac01.solution(24, 24);   // 1
        System.out.println("answer = " + Arrays.toString(answer));

//        prac01.test(24);
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        if (yellow == 1) {
            int i = brown + yellow;
            int sqrt = (int) Math.sqrt(i);
            answer[0] = sqrt;
            answer[1] = sqrt;
            return answer;
        } else {
            List<Integer> test = test(yellow);
            for (Integer a : test) {
                int b = yellow / a;

                int i = 2 * a + 2 * b + 4;

                if (i == brown) {
                    answer[0] = b + 2;
                    answer[1] = a + 2;
                }

            }

            return answer;
        }

    }

    public List<Integer> test(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}