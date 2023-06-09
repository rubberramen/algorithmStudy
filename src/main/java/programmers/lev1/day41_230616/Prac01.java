package programmers.lev1.day41_230616;


/* 부족한 금액 계산하기 : https://school.programmers.co.kr/learn/courses/30/lessons/82612 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        long answer = prac01.solution(3, 20, 4);   // 10
        System.out.println("answer = " + answer);
    }

    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;
        for (long i = 1; i <= count; i++) {
            sum += i * price;
        }

        answer = money - sum;

        if (answer > 0) return 0;
        else return -answer;
    }
}
