package org.example;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args){
        FibonacciNumbers T = new FibonacciNumbers();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = T.solution(n);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    public int[] solution(int n){
        int[] arr = new int[n];
        arr[0]=1;
        for(int i=1; i<n; i++){
            if(i<2) arr[i]=1;
            else arr[i]=arr[i-1] + arr[i-2];
        }
        return arr;
    }

    //without array
    public void solution2(int n){
        int a=1, b=1, c;
        System.out.println(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }
}
