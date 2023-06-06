package inflearn.sortingAndSearching;

import java.util.Scanner;

public class ThreeInsertion {

    public static void main(String[] args) {
        ThreeInsertion T = new ThreeInsertion();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");  // 11 7 5 6 10 9
    }

    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;  // 맨앞
        }
        return arr;
    }

    public int[] solution1(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j <= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }
}
