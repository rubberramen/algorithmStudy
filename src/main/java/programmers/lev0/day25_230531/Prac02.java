package programmers.lev0.day25_230531;

import java.util.Arrays;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(new String[]{"left", "left", "left", "right"}, new int[]{3, 3});
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                answer[0]--;
                if(answer[0] < -(int)(board[0] / 2))
                    answer[0] = -(int)(board[0] / 2);
            } else if (keyinput[i].equals("right")) {
                answer[0]++;
                if(answer[0] > (int)(board[0] / 2))
                    answer[0] = (int)(board[0] / 2);
            } else if (keyinput[i].equals("up")) {
                answer[1]++;
                if(answer[1] > (int)(board[1] / 2))
                    answer[1] = (int)(board[1] / 2);
            } else {
                answer[1]--;
                if(answer[1] < -(int)(board[1] / 2))
                    answer[1] = -(int)(board[1] / 2);
            }
        }

        return answer;
    }

    // 실패작
    public int[] solutionXXX(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};

        int hMax = board[0] / 2;
        int hMin = -hMax;
        int vMax = board[1] / 2;
        int vMin = -vMax;

        for (String s : keyinput) {
            if (s.equals("up")) {
                answer[1]++;
            } else if (s.equals("down")) {
                answer[1]--;
            } else if (s.equals("left")) {
                answer[0]--;
            } else {
                answer[0]++;
            }
        }

        if (answer[0] > hMax) {
            answer[0] = hMax;
        }

        if (answer[0] < hMin) {
            answer[0] = hMin;
        }

        if (answer[1] > vMax) {
            answer[1] = vMax;
        }

        if (answer[1] < vMin) {
            answer[1] = vMin;
        }
        return answer;
    }

}
