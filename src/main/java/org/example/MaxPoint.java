package org.example;

import java.util.Scanner;

public class MaxPoint {
    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;
    public static void main(String[] args){
        MaxPoint T = new MaxPoint();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a=new int[n];
        int[] b= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();  // 점수
            b[i]=sc.nextInt();  // 걸리는 시간
        }
        T.DFS(0, 0, 0, a, b);
    }
    public void DFS(int L, int sum, int time, int[] a, int[] b){
        if(time>m) return;
        if(L==n){
            answer=Math.max(answer, sum);
        } else {
            DFS(L+1, sum+a[L], time+b[L], a, b);
            DFS(L+1, sum, time, a, b);
        }
    }
}
