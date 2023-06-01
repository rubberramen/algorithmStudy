package programmers.lev0.day27_230602;

/* 치킨 쿠폰 : https://school.programmers.co.kr/learn/courses/30/lessons/120884 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(1081);
        System.out.println("answer = " + answer);
    }

    public int solution(int chicken) {

        int coupon = chicken;
        int service = coupon / 10;
        coupon = (coupon % 10) + (coupon / 10);

        while (coupon >= 10) {
            service += coupon / 10;
            coupon = (coupon % 10) + (coupon / 10);
        }

        return service;
    }

}
