package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {
    public static void main(String[] args){
        SavePrincess T = new SavePrincess();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(T.solution(n, m));
    }
    public int solution (int n, int m){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1;i<=n;i++) Q.offer(i);
        while(!Q.isEmpty()){        // 비면 멈춤
            for(int i=1;i<m;i++) Q.offer(Q.poll());  //꺼내고 리턴 받은 값을 다시 넣음
            Q.poll();
            if(Q.size()==1) answer=Q.poll();
        }
        return answer;
    }
}
