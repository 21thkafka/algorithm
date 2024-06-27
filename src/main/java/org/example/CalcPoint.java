package org.example;

import java.util.Scanner;

public class CalcPoint {
    public static void main(String[] args){
        CalcPoint T = new CalcPoint();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[] arr){
        int cnt=0;
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                if(i==0 || arr[i-1]==0) answer[i] = 1;
                else answer[i] = answer[i-1]+1;
            } else answer[i]=0;
        }
        for(int x : answer) cnt+=x;
        return cnt;
    }

    public int solution2(int n, int[] arr){
        int answer = 0, cnt=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                answer+=cnt;
            } else cnt=0;
        }
        return answer;
    }
}
