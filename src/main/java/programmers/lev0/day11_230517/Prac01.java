package programmers.lev0.day11_230517;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String answer = prac01.solution("nict to meet you");
        System.out.println("answer = " + answer);


    }

    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        char[] chars = my_string.toCharArray();
        for (char aChar : chars) {
            if (aChar != 'a' && aChar != 'e' && aChar != 'i' && aChar != 'o' && aChar != 'u') {
                answer.append(aChar);
            }
        }
        return answer.toString();
    }

}
