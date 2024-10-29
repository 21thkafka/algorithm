package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FindCourseAdjacencyMatrixArrayList {
    //DFS를 사용하기에 정점의 갯수가 너무 많을 때 인접리스트를 생성해서 사용하는 방법
    static int n, m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public static void main(String[] args){
        FindCourseAdjacencyMatrixArrayList T = new FindCourseAdjacencyMatrixArrayList();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){    //ArrayList 객체 생성
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph.get(a).add(b);          //방향 그래프이므로 하나만 함
        }
        ch[1]=1;
        T.DFS(1);
        System.out.println(answer);
    }

    public void DFS(int v){
        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }
    }

}
