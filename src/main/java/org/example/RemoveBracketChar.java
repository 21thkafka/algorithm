package org.example;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracketChar {
    public static void main(String[] args){
        RemoveBracketChar T = new RemoveBracketChar();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else if(x==')') stack.pop();
            else if(stack.isEmpty()) answer += Character.toString(x);
        }
        return answer;
    }

    public String solution2(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x==')'){
                while(stack.pop()!='(');
            } else stack.push(x);
        }
        for(int i=0;i<stack.size(); i++) answer+=stack.get(i);
        return answer;
    }
}
