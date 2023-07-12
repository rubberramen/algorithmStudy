package inflearn.daily.sec2Array.day67_230712;

/* 3. 가위 바위 보 : https://cote.inflearn.com/contest/10/problem/02-03 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac3 {

    public static void main(String[] args) {
        Prac3 prac1 = new Prac3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
//        int n = 5;
//        int[] arr1 = {2, 3, 3, 1, 3};
//        int[] arr2 = {1, 1, 2, 2, 3};

        for (String str : prac1.solution(n, arr1, arr2)) {
            System.out.println(str);
        }
    }

    public ArrayList<String> solution(int n, int[] arr1, int[] arr2) {

        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (arr1[i] == arr2[i]) {
                answer.add("D");
            } else if ((arr1[i] == 1 && arr2[i] == 3) || (arr1[i] == 2 && arr2[i] == 1) || (arr1[i] == 3 && arr2[i] == 2)) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }

    public ArrayList<Character> solution1(int n, int[] arr1, int[] arr2) {

        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (arr1[i] == arr2[i]) {
                answer.add('D');
            } else if (arr1[i] == 1 && arr2[i] == 3) {
                answer.add('A');
            } else if (arr1[i] == 2 && arr2[i] == 1) {
                answer.add('A');
            } else if (arr1[i] == 3 && arr2[i] == 2) {
                answer.add('A');
            } else {
                answer.add('B');
            }
        }

        return answer;
    }
}