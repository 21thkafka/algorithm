package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class ClassLeader {
    public static void main(String[] args){
        ClassLeader T = new ClassLeader();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution2(n, str));
    }
    public String solution(int n, String str){
        String answer = "";
        char[] arr=str.toCharArray();
        HashMap<String,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0; i<n; i++){
            String index = String.valueOf(arr[i]);
            int cnt = map.containsKey(index) ? map.get(index)+1 : 1;
            if(cnt>max){
                max = cnt;
                answer = index;
            }
            map.put(index,cnt);
        }

        return answer;
    }

    public char solution2(int n , String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(x + " " + map.get(x));
            if(map.get(key)>max){
                max=map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}

