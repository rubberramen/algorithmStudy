package programmers.lev1.day40_230615;


/* 없는 숫자 더하기 : https://school.programmers.co.kr/learn/courses/30/lessons/86051 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(new int[]{1,2,3,4}, new int[]{-3, -1, 0, 2});   // "수박수"
        System.out.println("answer = " + answer);
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < b.length; i++) {
            int tmp = a[i] * b[i];
            answer += tmp;
        }

        return answer;
    }
}
