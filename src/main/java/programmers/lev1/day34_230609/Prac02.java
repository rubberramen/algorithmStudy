package programmers.lev1.day34_230609;


import java.util.Arrays;

/* x만큼 간격이 있는 n개의 숫자 : https://school.programmers.co.kr/learn/courses/30/lessons/12954 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        long[] answer = prac01.solution(2, 5);  // [2,4,6,8,10]
        System.out.println(Arrays.toString(answer));
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += x;
            answer[i] = tmp;
        }

        return answer;
    }
}
