package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoArray {
    public static void main(String[] args){
        CombineTwoArray T = new CombineTwoArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j=0; j<m; j++){
            arr2[j]=sc.nextInt();
        }
//        System.out.println(T.solution(n, arr1, m, arr2));
        for(int x : T.solution2(n, arr1, m, arr2)) System.out.print(x+" ");
    }
    public String solution(int n, int[] arr1, int m, int[] arr2){
        String answer = "";
        int diff = Math.min(m, n);
        for(int i=0;i<m||i<n;i++){
            if(i<diff){
                if((i==0 && arr1[i] <= arr2[i]) || (arr1[i] >= arr2[i-1] && arr1[i] <= arr2[i])){
                    answer +=  arr1[i] + " " + arr2[i] + " ";
                }
            } else if(m<n){
                answer +=  arr1[i] + " ";
            } else{
                answer += arr2[i] + " ";
            }
        }
        return answer;
    }
    public ArrayList<Integer> solution2(int n, int[] a, int m, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }
}
