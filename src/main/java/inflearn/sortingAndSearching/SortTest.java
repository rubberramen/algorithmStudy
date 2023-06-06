package inflearn.sortingAndSearching;

import java.util.Scanner;

public class SortTest {

    public static void main(String[] args) {
        SortTest T = new SortTest();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.selection(n, arr)) System.out.print(x + " ");
    }

    private int[] selection(int n, int[] arr) {

        int[] answer = {};

        return answer;
    }

    private int[] bubble(int n, int[] arr) {

        int[] answer = {};

        return answer;
    }

    private int[] insertion(int n, int[] arr) {
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
