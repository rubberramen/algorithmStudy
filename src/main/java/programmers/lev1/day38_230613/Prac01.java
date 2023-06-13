package programmers.lev1.day38_230613;


import java.util.Arrays;

/* 서울에서 김서방 찾기 : https://school.programmers.co.kr/learn/courses/30/lessons/12919 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        String answer = prac01.solutionBest(new String[]{"Jane", "Kim"});   // "김서방은 1에 있다"
        System.out.println("answer = " + answer);
    }

    public String solution(String[] seoul) {
        String answer = "";

        int tmp = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                tmp = i;
            }
        }
        answer = "김서방은 " + tmp + "에 있다";
        return answer;
    }

    public String solutionBest(String[] seoul) {
        int i = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 "+ i + "에 있다";
    }
}
