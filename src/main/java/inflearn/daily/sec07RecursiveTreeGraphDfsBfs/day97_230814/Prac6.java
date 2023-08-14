package inflearn.daily.sec07RecursiveTreeGraphDfsBfs.day97_230814;

/* 6. 부분집합 구하기(DFS) :
자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
*/

public class Prac6 {

    // 집합 원소의 갯수
    static int n;

    // Check 배열. : 사용한다 or 안한다 표시
    static int[] ch;

    public static void main(String[] args) {
        Prac6 T = new Prac6();
        n = 3;
        ch = new int[n + 1];  // 인덱스 번호를 원소로 생각하겠다.
        T.DFS(1);
    }

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += i + " ";
                }
            }

            if (tmp.length() > 0) {
                System.out.println(tmp);
            } else {
                System.out.print("공집합");
            }

        } else {
            ch[L] = 1;  // 사용함
            DFS(L + 1);  // 왼쪽

            ch[L] = 0;  // 사용하지 않음
            DFS(L + 1);  // 오른쪽
        }
    }
}