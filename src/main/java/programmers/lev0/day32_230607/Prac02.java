package programmers.lev0.day32_230607;

/* 모스부호(1) : https://school.programmers.co.kr/learn/courses/30/lessons/120838 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        String answer = prac01.solution(".... . .-.. .-.. ---");
        System.out.println("answer = " + answer);
    }

    public String solution(String letter) {
        String answer = "";

        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};

        String[] split = letter.split(" ");
        for (String s : split) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) answer += Character.toString(i + 'a');
            }
        }
        return answer;
    }

}
