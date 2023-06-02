package programmers.lev0.day27_230602;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 등수 매기기 : https://school.programmers.co.kr/learn/courses/30/lessons/120882 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int[] answer = prac01.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}, {90, 100}, {100, 90}});
        System.out.println("answer = " + Arrays.toString(answer));
    }

    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    }

}
