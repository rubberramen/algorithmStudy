package programmers.lev2.day63_230708;


import java.util.Arrays;

/* 짝수 홀수 개수 : https://school.programmers.co.kr/learn/courses/30/lessons/120824 */
public class Test {
    public static void main(String[] args) {
        Test prac01 = new Test();
        int[] num_list = {1, 3, 5, 7};
        int[] answer = prac01.solution(num_list);   // [2, 3]
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        int even = 0;
        int odd = 0;

        for (int i = 0; i <= num_list.length - 1; i++) {
            int a = num_list[i];
            if (a % 2 == 0) {
                // 짝수
//                even = even + 1;
//                even += 1;
                even++;
            } else {
                // 홀수
                odd = odd + 1;
            }
        }

        answer[0] = even;
        answer[1] = odd;

        return answer;
    }

    public int[] solution1(int[] num_list) {
        int[] answer = new int[2];
        int evenNum = 0;
        int oddNum = 0;

        for (int i = 0; i < num_list.length; i++) {

            if (num_list[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        answer[0] = evenNum;
        answer[1] = oddNum;

        return answer;
    }
}