package programmers.lev1.day43_230618;


import java.util.Arrays;

/* 삼총사 : https://school.programmers.co.kr/learn/courses/30/lessons/131705 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(new int[]{-2, 3, 0, 2, -5});   // false
        System.out.println("answer = " + answer);
    }

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }

}
