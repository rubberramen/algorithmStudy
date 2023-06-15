package programmers.lev1.day40_230615;


/* 수박수박수박수박수박수? : https://school.programmers.co.kr/learn/courses/30/lessons/12922 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution(4);   // "수박수"
        System.out.println("answer = " + answer);
    }

    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += "박";
            } else {
                answer += "수";
            }
        }

        return answer;
    }
}
