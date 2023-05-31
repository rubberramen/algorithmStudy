package programmers.lev0.day26_230601;

/* 직사각형 넓이 구하기 : https://school.programmers.co.kr/learn/courses/30/lessons/120860 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}});
        System.out.println("answer = " + answer);
    }

    public int solution(int[][] dots) {
        int answer = 0;

        int hMax = Integer.MIN_VALUE;
        int hMin = Integer.MAX_VALUE;

        for (int[] dot : dots) {
            if (dot[0] > hMax) hMax = dot[0];
            if (dot[0] < hMin) hMin = dot[0];
        }

        int vMax = Integer.MIN_VALUE;
        int vMin = Integer.MAX_VALUE;

        for (int[] dot : dots) {
            if (dot[1] > vMax) vMax = dot[1];
            if (dot[1] < vMin) vMin = dot[1];
        }

        answer = (hMax - hMin) * (vMax - vMin);

        return answer;
    }

}
