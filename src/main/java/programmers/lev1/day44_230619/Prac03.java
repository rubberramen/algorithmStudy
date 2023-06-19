package programmers.lev1.day44_230619;


/* 최소직사각형 : https://school.programmers.co.kr/learn/courses/30/lessons/86491 */
public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});   // 4000
        System.out.println("answer = " + answer);
    }

    public int solution(int[][] sizes) {
        int answer = 0;

        for (int[] size : sizes) {
            if (size[0] < size[1]) {
                int tmp;
                tmp = size[0];
                size[0] = size[1];
                size[1] = tmp;
            }
        }

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            if (maxX <= sizes[i][0]) {
                maxX = sizes[i][0];
            }

            if (maxY <= sizes[i][1]) {
                maxY = sizes[i][1];
            }
        }

        answer = maxX * maxY;
        return answer;
    }
}
