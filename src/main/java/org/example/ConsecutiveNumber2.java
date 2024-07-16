package org.example;

import java.util.Scanner;

public class ConsecutiveNumber2 {
    public static void main(String[] args){
        ConsecutiveNumber2 T = new ConsecutiveNumber2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
    public int solution(int n){
        int answer = 0, cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }
}
