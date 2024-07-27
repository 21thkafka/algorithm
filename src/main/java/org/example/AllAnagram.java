package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
    public static void main(String[] args){
        AllAnagram T = new AllAnagram();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String k = sc.nextLine();
        System.out.println(T.solution2(n, k));
    }

    public int solution(String n, String k) {
        int answer = 0;
        int lt = 0;
        char[] arr1 = n.toCharArray();
        char[] arr2 = k.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int rt = 0; rt < k.length() - 1; rt++) {
            map.put(arr2[rt], map.getOrDefault(arr2[rt], 0) + 1);
        }
        for (int rt = k.length() - 1; rt < n.length() - 1; rt++) {
            for (int i = 0; i < k.length(); i++) {
                if (map.containsKey(arr1[i])) answer++;
            }
            map.put(arr1[lt], map.get(arr1[lt]) - 1);
            if (map.get(arr1[lt]) == 0) map.remove(arr1[lt]);
            lt++;
        }
        return answer;
    }

    public int solution2(String s, String t){
        int answer =0;
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();
        for(char x : t.toCharArray()) tm.put(x, tm.getOrDefault(x, 0)+1);
        int L = t.length()-1;
        for(int i=0; i<L; i++) sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0)+1);
        int lt = 0;
        for(int rt=L; rt<s.length(); rt++){
            sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0)+1);
            if(sm.equals(tm)) answer++;
            sm.put(s.charAt(lt), sm.get(s.charAt(lt))-1);
            if(sm.get(s.charAt(lt))==0) sm.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }
}
