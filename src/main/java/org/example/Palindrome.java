package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Palindrome T = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str){
        String result="NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String revers = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        System.out.println(revers);
        if(str.equals(revers)) result="YES";
        return result;

    }
}
