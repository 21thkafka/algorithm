package org.example;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthMaxNumber {
    public static void main(String[] args){
        KthMaxNumber T = new KthMaxNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, k, arr));

    }

    public int solution(int n, int k, int[]arr){
        int answer = 0;
        TreeSet<Integer> Tree = new TreeSet<>(Collections.reverseOrder());  //내림차순 정렬
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                for(int l=j+1;l<n; l++){
                    Tree.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tree){
            cnt++;
            if(cnt==k) return x;
        }
        return -1;
    }
}
