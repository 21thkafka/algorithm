package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Jokekids {
    public static void main(String[] args){
        Jokekids T = new Jokekids();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n; i++) arr[i] = sc.nextInt();
        for(int x: T.solution2(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr){
        int[] answer = new int[2];
        for(int i=0;i<n;i++){
            if(i==0 && arr[i]>arr[i+1]) answer[0] = i + 1;
            else if(i==n-1 && arr[i]< arr[n-2]) answer[1] = i + 1;
            else if(i!=0 && i!=n-1){
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) answer[0] = i+1;
                else if(arr[i]<arr[i-1] && arr[i]<arr[i+1]) answer[1] = i+1;
            }
        }
        return answer;
    }
    public ArrayList<Integer> solution2(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp=arr.clone();
        Arrays.sort(tmp);
        for(int i=0;i<n;i++){
            if(arr[i]!=tmp[i]) answer.add(i+1);
        }
        return answer;
    }

}
