package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day94_230811;

/* 3. 팩토리얼 :
자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
예를 들어 5! = 5*4*3*2*1=120입니다.
*/

public class Prac3 {
    public static void main(String[] args) {
        Prac3 T = new Prac3();
        System.out.println(T.recursive(5));
    }

    public int recursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursive(n - 1);
        }
    }
}