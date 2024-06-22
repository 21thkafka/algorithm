package org.example;

import java.util.Scanner;

public class VisibleStudent {
    public static void main(String[] args){
        VisibleStudent T = new VisibleStudent();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(T.solution(arr));
    }
    public int solution(int[] arr){
        int cnt = 1;
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                cnt++;
                max = arr[i];
            }
        }
        return cnt;
    }
}
