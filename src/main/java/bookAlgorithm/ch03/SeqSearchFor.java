package bookAlgorithm.ch03;

import java.util.Scanner;

public class SeqSearchFor {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];        // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값할 값: ");       // 키값을 읽어 들임
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);    // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }

    private static int seqSearch(int[] x, int num, int ky) {
        for (int i = 0; i < num; i++) {
            if(x[i] == ky) return i;
        }
        return -1;
    }
}
