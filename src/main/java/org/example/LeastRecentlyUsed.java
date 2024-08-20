package org.example;

import java.util.Scanner;

public class LeastRecentlyUsed {
    public static void main(String[] args){
        LeastRecentlyUsed T = new LeastRecentlyUsed();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
    public int[] solution(int size, int n, int[] arr){
        int[] cache = new int[size];
        for(int x : arr){
            int pos=-1;  //index, 위치
            for(int i=0; i<size;i++) if(x==cache[i]) pos=i;     // 기존 캐시 안에 있는지 확인
            if(pos==-1){        // 기존 캐시 안에 없는 경우
                for(int i=size-1;i>=1; i--){
                    cache[i]=cache[i-1];
                }
            } else {            // 기존 캐시 안에 있는 경우
                for(int i=pos;i>=1; i--){
                    cache[i]=cache[i-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }
}
