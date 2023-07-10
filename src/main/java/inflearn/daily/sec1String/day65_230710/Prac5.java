package inflearn.daily.sec1String.day65_230710;

/* 5. 특정 문자 뒤집기 : https://cote.inflearn.com/contest/10/problem/01-05 */

import java.util.Scanner;

public class Prac5 {

    public static void main(String[] args) {
        Prac5 prac1 = new Prac5();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        System.out.println(prac1.solution(next));
    }

    public String solution(String str) {

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {

            while (!Character.isAlphabetic(charArray[left])) {
                left++;
            }

            while (!Character.isAlphabetic(charArray[right])) {
                right--;
            }

            char tmp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = tmp;
            left++;
            right--;
        }
        String answer = String.valueOf(charArray);

        return answer;
    }
}
