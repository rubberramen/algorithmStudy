package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day92_230809;

/* 1. 재귀함수 : 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요. */

public class Prac1 {
    public static void main(String[] args) {
        Prac1 T = new Prac1();
        T.solution(3);
        //System.out.println(T.solution(3));
    }

    public void solution(int n){
        recursive(n);
    }


    /**
     * 재귀함수는 반복문의 한 형태라고 이해해도 될듯.
     * -> 종료 조건을 줘야 함.
     * 초보 때는 if-else 구조로.
     */
    public void recursive(int n) {
        if (n == 0) {
            return;
        } else {
//            System.out.print(n + " ");
            recursive(n - 1);
            System.out.print(n + " ");
        }
    }
}