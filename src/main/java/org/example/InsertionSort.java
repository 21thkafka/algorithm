package org.example;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        InsertionSort T = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution2(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr){
        for(int i=1;i<n;i++){
            boolean check = false;
            int tmp=0;
            for(int j=0; j<=i; j++){
                if(!check && arr[i]<arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    check = true;
                } else if (check && tmp!=0){
                    int tmp2 = arr[j];
                    arr[j] = tmp;
                    tmp = tmp2;
                }
            }
        }
        return arr;
    }

    public int[] solution2(int n, int[] arr){
        for(int i=1; i<n; i++){
            int tmp = arr[i],j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
        return arr;
    }
}
