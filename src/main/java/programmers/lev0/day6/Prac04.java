package programmers.lev0.day6;

public class Prac04 {
    public static void main(String[] args) {
        Prac04 prac01 = new Prac04();
        int solution = prac01.solution(999);
        System.out.println("solution = " + solution);

//        int i = 2;
//        double pow = Math.pow(2, 3);
//        System.out.println("pow = " + pow);
    }

    public int solution(int hp) {
        int answer = 0;

        if ((hp / 5) > 0) {
            answer += hp / 5;
            hp = hp - ((hp / 5)*5); //
        }
        if ((hp / 3) > 0) {
            answer += hp / 3;
            hp = hp - ((hp / 3) * 3);
        }
        answer += hp;
        return answer;
    }


}
