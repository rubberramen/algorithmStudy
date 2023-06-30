package programmers.lev1.day55_230630;


import java.util.*;

/* 덧칠하기: https://school.programmers.co.kr/learn/courses/30/lessons/161989 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution(8, 4, new int[]{2, 3, 6});   // "[3,4,2,1,5]"
        System.out.println("answer = " + answer);
    }

    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m-1);
        int ans = 1;

        for(int i : section){
             if(i>=start && i<=end)
                continue;
            else{
                start = i;
                end = i + (m-1);
                ans++;
            }

        }
        return ans;
    }
}