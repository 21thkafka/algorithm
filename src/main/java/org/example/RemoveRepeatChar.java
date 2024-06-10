package org.example;

import java.util.Scanner;

public class RemoveRepeatChar {

    public static void main(String[] args){
        RemoveRepeatChar T = new RemoveRepeatChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution2(str));
    }

    public String solution(String str){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;
            //System.out.println("i : " + i + " / currentChar : " + currentChar);
            for(int j=0;j<i; j++){
            //    System.out.println("j : " + j + " / str.charAt(j) : " + str.charAt(j));
                if(str.charAt(j) == currentChar){
                    isDuplicate = true;
                }
            }
            if(!isDuplicate){
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    //해설코드
    public String solution2(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }
}
