package programmers.lev1.day41_230616;


/* 문자열 다루기 기본 : https://school.programmers.co.kr/learn/courses/30/lessons/12918 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        boolean answer = prac01.solution("1234");   // false
        System.out.println("answer = " + answer);
    }

    public boolean solution(String s) {
        boolean answer = false;

        if (s.length() == 4 || s.length() == 6) {
            char[] charArray = s.toCharArray();
            boolean flag = true;
            for (char c : charArray) {
                boolean digit = Character.isDigit(c);
                if (!digit) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer = true;
        }

        return answer;
    }
}
