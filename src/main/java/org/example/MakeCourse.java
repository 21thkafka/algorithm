package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakeCourse {
    public static void main(String[] args){
        MakeCourse T = new MakeCourse();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(T.solution(str1, str2));
    }

    public String solution(String str1, String str2){
        String answer = "NO";
        Queue<Character> Q = new LinkedList<>();
        for(char x : str1.toCharArray()) Q.offer(x);
        for(char x : str2.toCharArray()){
            if(!Q.isEmpty() && Q.peek()==x) Q.poll();
            if(Q.isEmpty()) answer = "YES";
        }
        return answer;
    }

    public String solution2(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()) {
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }
}
