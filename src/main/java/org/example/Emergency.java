package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Emergency {
    public static void main(String[] args){
        Emergency T = new Emergency();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pations = new int[n];
        for(int i=0; i<n; i++){
            pations[i] = sc.nextInt();
        }
        System.out.println(T.solution(pations, n, m));
    }

    public int solution(int[] pations,int n, int m){
        int answer = 1;
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<n; i++) q.offer(pations[i]);
        int max = 0;
        for(int i=0; i<n; i++) max = Math.max(max, pations[i]);
        for(int i=0; i<n; i++){
            if(max>q.peek()) q.offer(q.poll());
            else break;
        }
        for(int i=0;i<q.size();i++){
            if(q.poll() == pations[m-1]) answer= i+1;
        }
        return answer;
    }
    public int solution2(int[] pations,int n, int m){
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.offer(new Person(i, pations[i]));
        }
        while(!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(x.priority>tmp.priority){
                    q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }
}

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id=id;
        this.priority=priority;
    }
}
