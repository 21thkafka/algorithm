package org.example;

import java.util.Scanner;

public class BreakCode {
    public static void main(String[] args){
        BreakCode T = new BreakCode();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String str = sc.next();
        String[] arr = T.solution(str, cnt);
        for(String s : arr){
            System.out.print(s);
        }
    }

    public String[] solution(String str, int cnt){
        str = str.replaceAll("#", "1");
        str = str.replaceAll("\\*", "0");
        int turn = 0;
        int len = str.length()/cnt;
        String[] arr = new String[cnt];
        for(int i=0; i<str.length() && i+len<str.length(); i+=len){
            String s = str.substring(i, i+len);
            int n = Integer.parseInt(s, 2);
            arr[turn] = Character.toString(n);
            turn++;
        }
        return arr;
    }
    public String solution2(String s, int n){
        String anwser="";
        for(int i=0; i<n; i++){
            String tmp = s.substring(0,7).replace("#","1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2);
            anwser+=(char)num;
            s=s.substring(7);
        }
        return anwser;
    }
}
