package org.example;

import java.util.Scanner;
import java.util.Stack;

public class RightBracket {
    public static void main(String[] args){
        RightBracket T = new RightBracket();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
    public String solution(String str){
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";    // 문자열 끝나기 이전에 스택이 비어있음 올바르지 않은 괄호
                stack.pop();
            }
        }
        //문자열이 끝나도 좌괄호가 더 많은 상황 체크
        if(!stack.isEmpty()) return "NO";
        return answer;
    }
}
