package org.example;

import java.util.Scanner;

public class ExportNumber {

    public static void main(String[] args){
        ExportNumber T = new ExportNumber();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution2(str));
    }

    public int solution(String str){
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    //아스키코드 이용 방법
    public int solution2(String str){
        int answer = 0;
        for(char x : str.toCharArray()){
            System.out.println("x : " + x + " / answer : " + answer);
            if(x>=48 && x<= 57) answer=answer*10+(x);
        }
        return answer;
    }

    // isDigit로 숫자인지 구분해서 누적->숫자로 변환
    public int solution3(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }
}
