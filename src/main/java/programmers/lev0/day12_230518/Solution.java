package programmers.lev0.day12_230518;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i < n + 1; i++) {
            System.out.println("*".repeat(i));
        }
    }
}