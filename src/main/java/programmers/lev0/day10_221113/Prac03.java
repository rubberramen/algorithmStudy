package programmers.lev0.day10_221113;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int solution = prac01.solution(new int[]{10, 8, 6}, 3);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] box, int n) {
        int answer = 0;

        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;


        return a * b * c;
    }
}
