package org.example;


import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Test T = new Test();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
    public int solution(int n, int m, int[] arr){
        int answer = 0, cnt=0, lt=0;
        for(int rt=0;rt<n;rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>m){
                if(arr[lt]==0) cnt--;
                lt++;
            }
        }
        return answer;
    }

}
