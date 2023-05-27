package programmers.lev0.day20_230526;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution("aAb1B2cC34oOp");
        System.out.println("answer = " + answer);
    }

    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split("[a-zA-Z]");
        for (String s : split) {
            answer += s.isEmpty() ? 0 : Integer.parseInt(s);
        }
        return answer;
    }

}
