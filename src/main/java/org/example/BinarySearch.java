package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        BinarySearch T = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
    public int solution(int n, int m, int[] arr){
        int answer=0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m){
                answer=mid+1;
                break;
            }
            if(arr[mid]>m) rt = mid-1;  // 찾는 수가 arr[mid]보다 앞에 있는 경우
            else lt=mid+1;  //찬는 수가 arr[mid]보다 뒤에 있는 경우
        }
        return answer;
    }
}
