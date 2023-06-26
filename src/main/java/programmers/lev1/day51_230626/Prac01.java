package programmers.lev1.day51_230626;


import java.util.*;

/* 폰켓몬: https://school.programmers.co.kr/learn/courses/30/lessons/1845 */
public class Prac01 {
    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();
        int answer = prac01.solution3(new int[]{3, 1, 2, 3});   // 2
        System.out.println("answer = " + answer);
    }

    public int solution(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        Set<Integer> set = new HashSet<>(list);

        if (set.size() <= (nums.length / 2)) return set.size();
        else return (nums.length / 2);
    }

    public int solution2(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() <= (nums.length / 2)) return set.size();
        else return (nums.length / 2);
    }

    public int solution3(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return (set.size() <= (nums.length / 2)) ? set.size() : (nums.length / 2);
    }

    public int solution4(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return Math.min(set.size(), (nums.length / 2));
    }
}