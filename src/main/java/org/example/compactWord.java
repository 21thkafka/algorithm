package org.example;

import java.util.Scanner;

public class compactWord {

    public static void main(String[] args){
        compactWord T = new compactWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution2(str));
    }

    public String solution(String str){
        String anwser = "";
        char preChar = str.charAt(0);
        int cnt = 1;
        for(int i=0;i<str.length();i++){
            if(preChar==str.charAt(i) && str.charAt(i)>=65 && str.charAt(i)<=90 && i!=0) cnt++;
            else if(cnt>1) {
                anwser += preChar+Integer.toString(cnt)+str.charAt(i);
                cnt = 0;
            } else anwser += str.charAt(i);
            preChar = str.charAt(i);
        }
        return anwser;
    }

    public String solution2(String s){
        String answer="";
        s=s+" ";
        int cnt=1;
        for(int i=0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }
}
