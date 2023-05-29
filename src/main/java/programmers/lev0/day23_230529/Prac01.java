package programmers.lev0.day23_230529;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(new int[]{1, 2, 3, 4, 5, 6}, 5);
        System.out.println("answer = " + answer);
    }

    public int solution(int[] numbers, int k) {
        int answer = 0;

        int q = (k - 1) * 2;
        int w = q % numbers.length;
        answer = numbers[w];

        return answer;
    }

}
