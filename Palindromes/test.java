package Palindromes;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        solution sl=new solution();
        boolean b=sl.Solution(num);
        System.out.println(b);
    }
}
