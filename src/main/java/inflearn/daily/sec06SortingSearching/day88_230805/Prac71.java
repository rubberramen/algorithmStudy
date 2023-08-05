package inflearn.daily.sec06SortingSearching.day88_230805;

/* 7. 좌표 정렬 : https://cote.inflearn.com/contest/10/problem/06-07 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prac71 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
        int n = 5;
        ArrayList<Point2> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int x = kb.nextInt();
//            int y = kb.nextInt();
//            arr.add(new Point2(x, y));
//        }

        int x1 = 2;
        int y1 = 7;
        arr.add(new Point2(x1, y1));

        int x2 = 1;
        int y2 = 3;
        arr.add(new Point2(x2, y2));

        int x3 = 1;
        int y3 = 2;
        arr.add(new Point2(x3, y3));

        int x4 = 2;
        int y4 = 5;
        arr.add(new Point2(x4, y4));

        int x5 = 3;
        int y5 = 6;
        arr.add(new Point2(x5, y5));
        
        Collections.sort(arr);
        for (Point2 o : arr) System.out.println(o.getX() + " " + o.getY());
    }
}

class Point2 implements Comparable<Point2>{
    private int x;
    private int y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point2 o) {
        if (this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}