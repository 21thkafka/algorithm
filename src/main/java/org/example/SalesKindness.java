package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesKindness {
    public static void main(String[] args){
        SalesKindness T = new SalesKindness();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
    //    System.out.println(T.solution(n, k, arr));
        for(int x: T.solution2(n, k, arr)) System.out.print(x+" ");
    }

    public String solution(int n, int k, int[] arr){
        String answer="";
        int lt = 0, rt = k-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        while(rt+1<n){
            int cnt = 0;
            for(int key : map.keySet()){
                cnt++;
            }
            System.out.println();
            answer += Integer.toString(cnt) + " ";
            lt++; rt++;
            if(map.containsKey(arr[lt]) && map.get(arr[lt])>1) map.put(arr[lt], map.get(arr[lt])-1);
            else map.remove(arr[lt]);
            if(map.containsKey(arr[rt])) map.put(arr[rt], map.get(arr[rt])+1);
            else map.put(arr[rt], 1);
        }
        return answer;
    }
    public ArrayList<Integer> solution2(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;
        for(int rt=k-1;rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
}
