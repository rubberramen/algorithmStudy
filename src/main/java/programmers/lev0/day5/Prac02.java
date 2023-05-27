package programmers.lev0.day5;

public class Prac02 {
    public static void main(String[] args) {
//        Prac02 prac01 = new Prac02();
//        int solution = prac01.solution(976);
//        System.out.println("solution = " + solution);

        double sqrt = Math.sqrt(102);
        System.out.println("sqrt = " + sqrt);
        double v = sqrt % 1;
        System.out.println("v = " + v);
        int a = (int) sqrt;
        System.out.println("a = " + a);

        double b = 3.24325252;
        float c = 34.243f;
        System.out.println("b = " + b);


    }

    public int solution(int n) {
        int answer = 0;

//        double sqrt = Math.sqrt(n);

        for (int i = 1; i < n; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 2;
    }


}
