package programmers.lev1.day40_230615;


/* 가운데 글자 가져오기 : https://school.programmers.co.kr/learn/courses/30/lessons/12903 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String answer = prac01.solution("qwer");   // c
        System.out.println("answer = " + answer);
    }

    public String solution(String s) {
        String answer = "";

        String[] split = s.split("");

        if (split.length % 2 != 0) {   // 짝수개 길이.
            int i = ((split.length + 1) / 2) - 1;
            answer = split[i];
        } else {
            int i = split.length / 2;
            answer += split[i-1];
            answer += split[i];
        }
        return answer;
    }
}
