package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBigNumber {
    public static void main(String[] args){
        PrintBigNumber T = new PrintBigNumber();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(T.solution(str, cnt));
    }

    public String solution(String str, int cnt){
        String anwser = "";
        int n = 0;
        String[] arr = str.split(" ");
        for(int i=0; i<cnt; i++){
            if(n<Integer.parseInt(arr[i])){
                anwser += arr[i] + " ";
            }
            n = Integer.parseInt(arr[i]);
        }
        return anwser;
    }


    //해설 코드
    public static void main2(String[] args){
        PrintBigNumber T = new PrintBigNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution2(n, arr)){
            System.out.println(x+" ");
        }
    }
    public ArrayList<Integer> solution2(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1;i<n; i++){
            if(arr[i]>arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }
}
