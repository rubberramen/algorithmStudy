package programmers.lev2.day63_230708;


import java.util.Arrays;

/* 배열 원소의 길이 : https://school.programmers.co.kr/learn/courses/30/lessons/120854 */
public class Test2 {
    public static void main(String[] args) {
        Test2 prac01 = new Test2();
        int[] answer = prac01.solution(new String[]{"We", "are", "the", "world!"});   // [2, 3, 3, 6]
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(String[] strlist) {

        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            int length = strlist[i].length();
            answer[i] = length;
        }
        return answer;
    }
}