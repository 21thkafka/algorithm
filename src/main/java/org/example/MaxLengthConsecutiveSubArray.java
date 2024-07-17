package org.example;

import java.util.Scanner;

public class MaxLengthConsecutiveSubArray {
    public static void main(String[] args){
        MaxLengthConsecutiveSubArray T = new MaxLengthConsecutiveSubArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution2(n, m, arr));
    }

    public int solution(int n, int k, int[] arr){
        int answer = 0, lt=0, rt=0, cnt=0;
        for(int i=0;i<n;i++){
            i=lt=rt;
            while(k>0){
                if(arr[rt]==1) cnt++;
                else k--;
                rt++;
            }
            if(cnt>answer) answer = cnt;
        }
        return answer;

    }

    public int solution2(int n, int k, int[] arr){
        int answer =0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        return answer;
    }
}
