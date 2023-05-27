package programmers.lev0.day13_230519;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution2("hello", 1, 2);
        System.out.println("answer = " + answer);
    }

    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();

        String[] split = my_string.split("");
        String tmp = split[num1];
        split[num1] = split[num2];
        split[num2] = tmp;

        for (String s : split) {
            answer.append(s);
        }

        return answer.toString();
    }

    public String solution2(String my_string, int num1, int num2) {

        String[] split = my_string.split("");
        String tmp = split[num1];
        split[num1] = split[num2];
        split[num2] = tmp;

        return String.join("", split);
    }

}
