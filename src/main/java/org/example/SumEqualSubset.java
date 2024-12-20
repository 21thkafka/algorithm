package org.example;

import java.util.Scanner;

public class SumEqualSubset {
    static String answer="NO";
    static int n, total=0;
    boolean flag = false;   // 부분집합 합을 발견하면 재귀를 빨리 리턴시키기 위한 표식
    public static void main(String[] args){
        SumEqualSubset T = new SumEqualSubset();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
    public void DFS(int L, int sum, int[] arr){
        if(flag) return;
        if(sum>total/2) return;
        if(L==n){
            if((total-sum)==sum){
                answer="YES";
                flag=true;
            }
        }else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
}
