package org.example;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        BubbleSort T = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr){
        for(int i=0; i<n; i++){
            int check=0;
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    check++;
                }
            }
            if(check==0) break; // 한번도 자리바꿈이 없으면 정렬이 끝났음으로 보고 for문 종료
        }
        return arr;
    }
    public int[] solution2(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }
}
