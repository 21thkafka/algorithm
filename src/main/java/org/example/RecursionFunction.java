package org.example;

import java.util.Scanner;

public class RecursionFunction {
    public static void main(String[] args){
        RecursionFunction T = new RecursionFunction();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.DFS(n);

    }
    public void DFS(int n){
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n%2 + " ");
        }
    }
}
