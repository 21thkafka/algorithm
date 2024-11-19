package org.example;

import java.util.Scanner;

public class RepeatedPermutation {
    static int[] pm;
    static int n, m;
    public static void main(String[] args){
        RepeatedPermutation T = new RepeatedPermutation();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        pm=new int[m];
        T.DFS(0);
    }
    public void DFS(int L){
        if(L==m){
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=1; i<=n; i++){
                pm[L]=i;
                DFS(L+1);
            }
        }
    }
}
