package programmers.lev0.day2;

public class Prac01 {
    public static void main(String[] args) {

        Prac01 prac01 = new Prac01();
        int solution = prac01.solution(64,6);
        System.out.println("solution = " + solution);

    }

    public int solution(int n, int k) {
        int answer = 0;

//        answer = 12000 * n + 2000 * k;

        int a = 0;
        int i = n / 10;
        int i1 = k - i;
        int i2 = i1 < 0 ? 0 : i1;

        answer = 12000 * n + 2000 * i2;


        return answer;
    }


}
