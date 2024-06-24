package org.example;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        PrimeNumber T = new PrimeNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution2(n));
    }

    public int solution(int n){
        int answer = 0;
        for(int i=2;i<=n;i++){
            int cnt = 0;
            int time = i/2;
            for(int j=1;j<=time;j++){
                if(i % j == 0) cnt++;
            }
            if(cnt == 1) answer++;
        }
        return answer;
    }
    public int solution2(int n){
        int answer=0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }
        return answer;
    }
}
