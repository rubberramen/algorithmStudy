package programmers.lev1.day56_230701;


/* [1차] 다트 게임: https://school.programmers.co.kr/learn/courses/30/lessons/17682 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution("1S2D*3T");   // 37
        System.out.println("answer = " + answer);
    }

    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];

        int n = 0, idx = 0;
        String numstr = "";

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            //숫자일 때
            if (c >= '0' && c <= '9') {
                numstr += String.valueOf(c);

            }
            //보너스일 때
            else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(numstr);
                if (c == 'S') {
                    dart[idx++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    dart[idx++] = (int) Math.pow(n, 2);
                } else {
                    dart[idx++] = (int) Math.pow(n, 3);
                }
                numstr = "";
            }
            //옵션일 때
            else {
                if (c == '*') {
                    dart[idx - 1] *= 2;
                    if (idx - 2 >= 0) dart[idx - 2] *= 2;
                } else {
                    dart[idx - 1] *= (-1);
                }
            }
        }

        answer = dart[0] + dart[1] + dart[2];

        return answer;
    }
}