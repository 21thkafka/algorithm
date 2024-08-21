package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicationCheck {
    public static void main(String[] args){
        DuplicationCheck T = new DuplicationCheck();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution2(n, arr));
    }

    public String solution(int n, int[] arr){
        String answer = "U";
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) map.put(i, arr[i]);
        for(int i=0;i<n;i++){
            map.remove(i);
            if(map.containsValue(arr[i])){
                answer = "D";
                break;
            }
        }
        return answer;
    }

    public String solution2(int n, int[] arr){
        String answer="U";
        Arrays.sort(arr);   //오름차순 정렬
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]) return "D";
        }
        return answer;
    }
}
