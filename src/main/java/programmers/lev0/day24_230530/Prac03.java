package programmers.lev0.day24_230530;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int answer = prac01.solution(new int[]{11, 7});
        System.out.println("answer = " + answer);
    }

    public int solution(int[] sides) {
        int answer = 0;

        for (int i = 1; i <= sides[0] + sides[1]; i++) {
            if (i > Math.max(sides[0], sides[1])) {
                if (sides[0] + sides[1] > i) {
                    answer++;
                }
            } else {
                if (i + Math.min(sides[0], sides[1]) > Math.max(sides[0], sides[1])) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
