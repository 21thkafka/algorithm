package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf1 {
    int answer = 0;
    int[] dis={1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public static void main(String[] args){
        FindCalf1 T = new FindCalf1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(T.BFS(n, m));
    }

    public int BFS(int n, int m){
        ch = new int[10001];
        ch[n] = 1;
        Q.offer(n);
        int L = 0;
        while(!Q.isEmpty()){
            int len=Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();

                for(int j=0;j<3; j++){
                    int nx=x+dis[j];         // 자식노드
                    if(nx==m) return L+1;      // 자식 노드가 찾는 값과 같으면 높이 리턴
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx]=1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }
}
