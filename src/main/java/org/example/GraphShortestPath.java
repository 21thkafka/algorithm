package org.example;
import java.util.*;

public class GraphShortestPath {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public static void main(String[] args){
        GraphShortestPath T = new GraphShortestPath();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt(); // 정점의 개수
        m=sc.nextInt(); // 간선의 개수
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        dis=new int[n+1];
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i=2;i<=n;i++){
            System.out.println(i+" : " + dis[i]);
        }

    }
    public void BFS(int v){
        Queue<Integer> queue=new LinkedList<>();
        ch[v]=1;
        dis[v]=0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv=queue.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    queue.offer(nv);
                    dis[nv]=dis[cv]+1;
                }
            }
        }
    }
}
