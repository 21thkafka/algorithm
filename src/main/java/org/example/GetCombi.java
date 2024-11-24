package org.example;

import java.util.Scanner;

public class GetCombi {
    static int n, m;
    static int[] combi;
    public static void main(String[] args){
        GetCombi T = new GetCombi();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
    public void DFS(int L, int s){
        if(L==m){
            for(int x: combi) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=s;i<=n;i++){
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }
}
