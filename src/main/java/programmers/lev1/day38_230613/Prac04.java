package programmers.lev1.day38_230613;


/* 핸드폰 번호 가리기 : https://school.programmers.co.kr/learn/courses/30/lessons/12948 */
public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac01 = new Prac04();
        String answer = prac01.solution("027778888");   // "김서방은 1에 있다"
        System.out.println("answer = " + answer);
    }

    public String solution(String phone_number) {

        StringBuilder sb = new StringBuilder(phone_number);

        for (int i = sb.length() - 5; i >= 0; i--) {
            sb.replace(i, i + 1, "*");
        }

        return sb.toString();
    }
}
