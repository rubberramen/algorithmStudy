package programmers.lev1.day52_230627;


import java.util.*;

/* 소수 만들기: https://school.programmers.co.kr/learn/courses/30/lessons/12977 */
public class Prac02 {
    public static void main(String[] args) {
        Prac02 prac01 = new Prac02();
        int answer = prac01.solution2(new int[]{1,2,7,6,4});   // 4
        System.out.println("answer = " + answer);
    }

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k]) == 1) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public int isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }


    public int solution2(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime2(nums[i] + nums[j] + nums[k])) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean isPrime2(int n) {
        for (int i = 2; i<n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}