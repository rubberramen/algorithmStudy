package programmers.lev0.day22_230528;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution("10 Z 20 Z");
        System.out.println("answer = " + answer);
    }

    public int solution(String s) {
        int answer = 0;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("Z")) {
                answer += Integer.parseInt(split[i]);
            } else answer -= Integer.parseInt(split[i - 1]);
        }

        return answer;
    }

    public int solution1(String s) {
        int answer = 0;

        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("Z")) {
                answer += Integer.parseInt(split[i]);
            } else answer -= Integer.parseInt(split[i - 1]);
        }

        return answer;
    }

}
