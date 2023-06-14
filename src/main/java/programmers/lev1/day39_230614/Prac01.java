package programmers.lev1.day39_230614;


import java.util.Arrays;

/* 없는 숫자 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/86051 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(new int[]{1,2,3,4,6,7,8,0});   // 14
        System.out.println("answer = " + answer);
    }

    public int solution(int[] numbers) {

        int tmp = 45;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return tmp - sum;
    }
}
