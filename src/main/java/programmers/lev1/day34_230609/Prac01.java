package programmers.lev1.day34_230609;


/* 평균 구하기 : https://school.programmers.co.kr/learn/courses/30/lessons/12944 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        double answer = prac01.solution(new int[]{1,2,3,4});
        System.out.println("answer = " + answer);
    }

    public double solution(int[] arr) {

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        double avg = sum / (double) arr.length;

        return avg;
    }
}
