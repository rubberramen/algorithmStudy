package programmers.lev0.day8;

public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int solution = prac01.solution(930211);
        System.out.println("solution = " + solution);

    }

    public int solution(int n) {
        int answer = 0;
//        int length = (int) (Math.log10(n)+1);
//
//        int a = n % 10;
//        int b = n / 10;
//
//        for (int i = 1; i < length+1; i++) {
//            answer += a;
//            a = b % 10;
//            b = b / 10;
//        }
        while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
    }
}
