package longestPalindromeString;

import java.util.Scanner;

/*
* 给你一个字符串 s，找到 s 中最长的回文子串。如果字符串的反序与原始字符串相同，则该字符串称为回文字符串
* */
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        solution sl=new solution();
        String s1=sl.longestPalindrome(s);
        System.out.println(s1);
    }
}
