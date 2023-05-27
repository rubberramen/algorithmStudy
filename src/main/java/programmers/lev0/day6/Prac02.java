package programmers.lev0.day6;

public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int solution = prac01.solution(580000);
        System.out.println("solution = " + solution);
    }

    public int solution(int price) {
        int answer = 0;

        if (price >= 500000) {
            answer = (int) (price * 0.8);
        } else if (price >= 300000) {
            answer = (int) (price * 0.9);
        } else if (price >= 100000) {
            answer = (int) (price * 0.95);
        } else {
            answer = price;
        }

        return answer;
    }


}
