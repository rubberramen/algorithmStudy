package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day93_230810;

/* 2. 재귀함수를 이용한 이진수 출력 :
10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용해서 출력해야 합니다.
*/

public class Prac2 {
    public static void main(String[] args) {
        Prac2 T = new Prac2();
        T.recursive(11);
    }

    public void recursive(int n) {
        if (n == 0) {
            return;
        } else {
//            System.out.print(n + " ");
            System.out.print(n % 2+ " ");
            recursive(n / 2);
//            System.out.print(n % 2);
        }
    }
}