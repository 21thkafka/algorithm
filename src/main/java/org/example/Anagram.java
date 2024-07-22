package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Anagram T = new Anagram();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(T.solution2(str1, str2));
    }
    public String solution(String str1, String str2){
        String answer ="YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char x : str1.toCharArray()){
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }
        for(char x : str2.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }

        if(map1.size() == map2.size()){
            for(char x : map1.keySet()){
                if(!map2.containsKey(x) || !map1.get(x).equals(map2.get(x)) ) {
                    answer = "NO";
                    break;
                }
            }
        } else answer = "NO";
        return answer;
    }

    public String solution2(String str1, String str2){
        String answer = "YES";
        HashMap<Character, Integer> map=new HashMap<>();
        for(char x : str1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : str2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
}
