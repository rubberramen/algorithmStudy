package programmers.lev0.day6;

public class Prac03 {
    public static void main(String[] args) {
        Prac03 prac01 = new Prac03();
        int solution = prac01.solution(7, 15);
        System.out.println("solution = " + solution);

//        int i = 2;
//        double pow = Math.pow(2, 3);
//        System.out.println("pow = " + pow);
    }

    public int solution(int n, int t) {
        int answer = 0;

        int pow = (int) Math.pow(2, t);
        answer = pow * n;
        return answer;
    }


}
