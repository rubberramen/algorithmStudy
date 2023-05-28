package codeUpBasic100.basic1Print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        // System.out.println("Hello Goorm! Your input is " + input);

        String[] a = input.split(" ");

        double v = Double.valueOf(a[0]) + Double.valueOf(a[1]);

        System.out.printf("%.6f", v);


//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a + b);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        // System.out.println("Hello Goorm! Your input is " + input);
//
//        String[] a = input.split(" ");
//        int n1 = Integer.parseInt(a[0]);
//        int n2 = Integer.parseInt(a[1]);
//
//        System.out.println(n1 + n2);
    }
}
