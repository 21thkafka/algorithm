package org.example;

import java.util.Scanner;

public class CombinationNumber {
    int[][] dy=new int[35][35];
    public static  void main(String[] args){
        CombinationNumber T = new CombinationNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(T.DFS(n, m));
    }

    public int DFS(int n, int m){
        if(dy[n][m]>0) return dy[n][m];
        if(n==m || m==0) return 1;
        else return dy[n][m] = DFS(n-1, m-1)+DFS(n-1, m);
    }
}
